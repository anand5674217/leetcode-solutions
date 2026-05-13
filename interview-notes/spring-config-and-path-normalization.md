# Spring Configuration And Path Normalization Notes

## Spring Java Configuration

For the Spring configuration question, the expected configuration class should explicitly define the required beans, scan the utility package, load the production properties file, and include the maintenance configuration.

Corrected reference file: [SystemConfig.java](code/SystemConfig.java)

Screenshot attempt reference: [SystemConfigAttempt.java](code/SystemConfigAttempt.java)

```java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.codility.utils")
@PropertySource("classpath:production.properties")
@Import(MaintenanceConfig.class)
public class SystemConfig {

    @Bean(initMethod = "initialize")
    public UsersRepository getUsersRepository() {
        return new UsersRepository();
    }

    @Bean("paymentsService")
    public LegacyPaymentsService legacyPaymentsService() {
        return new LegacyPaymentsService();
    }
}
```

Important details:

- The bean name should be `paymentsService`, not `paymentService`.
- `@Bean(initMethod = "initialize")` is the Spring lifecycle-aware way to call `UsersRepository.initialize()` right after construction.
- `@Import(MaintenanceConfig.class)` includes another configuration class in the same Spring application context.
- `@ComponentScan("com.codility.utils")` allows Spring to discover annotated classes in that package.
- `@PropertySource("classpath:production.properties")` loads the required property file.

## When To Use `@Import`

Use `@Import` when you want Spring to explicitly include another class while building the application context.

```java
@Configuration
@Import({DatabaseConfig.class, SecurityConfig.class})
public class AppConfig {
}
```

`@Import` is useful when:

- The target config class is outside the current component scan path.
- You want explicit modular configuration.
- You want to avoid broad package scanning.
- You are enabling framework-style behavior through selectors or registrars.

`@Import` can import:

- `@Configuration` classes.
- Regular component classes.
- Plain classes, which Spring can register directly as beans.
- `ImportSelector` implementations.
- `ImportBeanDefinitionRegistrar` implementations.

Java `import` and Spring `@Import` are different:

- Java `import` only lets the compiler refer to a class by simple name.
- Spring `@Import` tells Spring to process/register that class in the container.

If you do not use a Java import, you can still use the fully qualified class name:

```java
@Import(com.example.config.MaintenanceConfig.class)
```

## Annotation Alone Is Not Enough

Annotating a class with `@Configuration`, `@Component`, `@Service`, or `@Repository` does not make it active by itself. Spring must first discover or register the class.

Spring can discover/register classes through:

- `@ComponentScan`.
- `@SpringBootApplication`.
- `@Import`.
- XML configuration.
- Manual/programmatic registration.
- Spring Boot auto-configuration.

Mental model:

1. Spring discovers the class.
2. Spring processes its annotations.
3. Spring registers bean definitions.

If step 1 does not happen, the annotations are never processed.

## Alternatives To `@ComponentScan`

Spring can work without `@ComponentScan`. Component scanning is only one way to register beans.

Alternatives include:

- Explicit `@Bean` methods.
- `@Import`.
- XML bean definitions.
- Programmatic registration with `BeanDefinitionRegistry`.
- Spring Boot auto-configuration.

Example with explicit beans:

```java
@Configuration
public class AppConfig {

    @Bean
    public UserService userService() {
        return new UserService();
    }
}
```

In large systems, explicit configuration is often preferred for important modules because it reduces accidental bean loading and makes dependencies easier to reason about.

## Ways To Load Properties In Spring

`@PropertySource` is not the only option.

Common property-loading mechanisms:

- `@PropertySource("classpath:application.properties")`.
- Spring Boot automatic loading of `application.properties`.
- Spring Boot automatic loading of `application.yml`.
- `PropertySourcesPlaceholderConfigurer`.
- `Environment#getProperty(...)`.
- XML `<context:property-placeholder>`.
- `@ConfigurationProperties` for structured, type-safe config.
- JVM system properties, such as `-Dserver.port=9090`.
- Environment variables, commonly used in Docker/Kubernetes/cloud deployments.

Classic Spring often used:

```java
@Bean
public static PropertySourcesPlaceholderConfigurer propertyConfig() {
    return new PropertySourcesPlaceholderConfigurer();
}
```

Modern Spring Boot usually prefers:

- Auto-loaded `application.properties` or `application.yml`.
- `@ConfigurationProperties` for grouped config.
- Environment variables and JVM properties for deployment overrides.

## Directory Change Problem

For a command like `cd ../task`, a stack/deque-based solution is usually cleaner than manual index manipulation.

Corrected reference file: [DirectoryChanger.java](code/DirectoryChanger.java)

Screenshot attempt reference: [StringPathChanger.java](code/StringPathChanger.java)

```java
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public String changeDirectoryString(String currentDirectory, String command) {
    if (!command.startsWith("cd ")) {
        throw new IllegalStateException();
    }

    String path = command.substring(3);

    if (path.equals("/")) {
        return "/";
    }

    Deque<String> stack = new ArrayDeque<>();

    for (String dir : currentDirectory.split("/")) {
        if (!dir.isEmpty()) {
            stack.push(dir);
        }
    }

    if (path.startsWith("/")) {
        stack.clear();
    }

    for (String dir : path.split("/")) {
        if (dir.isEmpty() || dir.equals(".")) {
            continue;
        }

        if (dir.equals("..")) {
            if (!stack.isEmpty()) {
                stack.pop();
            }
        } else {
            stack.push(dir);
        }
    }

    if (stack.isEmpty()) {
        return "/";
    }

    List<String> result = new ArrayList<>(stack);
    Collections.reverse(result);

    return "/" + String.join("/", result);
}
```

This handles:

- `cd /`
- `cd ..`
- `cd ../../`
- Absolute paths like `cd /java`
- Trailing slashes like `cd /java/`
- Duplicate slashes
- Root protection when there are too many `..`

Common bugs to avoid:

- Java uses `&&`, not `and`.
- Use `command.substring(3)` to remove the `cd ` prefix.
- Do not let a directory index become negative.
- Remember that `"/dev/task".split("/")` produces a leading empty token.
- Normalize absolute paths before returning so `cd /java/` returns `/java`.
