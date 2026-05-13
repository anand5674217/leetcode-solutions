package com.codility.configuration;

import com.codility.beans.LegacyPaymentsService;
import com.codility.beans.UsersRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SystemConfigAttempt {

    @Bean
    public UsersRepository getUsersRepository() {
        UsersRepository usersRepository = new UsersRepository();
        usersRepository.initialize();
        return usersRepository;
    }

    @Bean("paymentService")
    public LegacyPaymentsService legacyPaymentsService() {
        return new LegacyPaymentsService();
    }

    @Bean
    public MaintenanceConfig getMaintenanceConfig() {
        return new MaintenanceConfig();
    }
}
