import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class DirectoryChanger {

    public String changeDirectoryString(String currentDirectory, String command) {
        if (!command.startsWith("cd ")) {
            throw new IllegalStateException("Command must start with cd");
        }

        String path = command.substring(3);

        if (path.equals("/")) {
            return "/";
        }

        Deque<String> directories = new ArrayDeque<>();

        if (!path.startsWith("/")) {
            for (String directory : currentDirectory.split("/")) {
                if (!directory.isEmpty()) {
                    directories.push(directory);
                }
            }
        }

        for (String directory : path.split("/")) {
            if (directory.isEmpty() || directory.equals(".")) {
                continue;
            }

            if (directory.equals("..")) {
                if (!directories.isEmpty()) {
                    directories.pop();
                }
            } else {
                directories.push(directory);
            }
        }

        if (directories.isEmpty()) {
            return "/";
        }

        List<String> result = new ArrayList<>(directories);
        Collections.reverse(result);

        return "/" + String.join("/", result);
    }
}
