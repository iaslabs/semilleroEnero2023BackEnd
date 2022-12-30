package co.com.ias.semilleroapi.infraestructure.configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    @Bean
    public DBSecret dbSecret(Environment env) {
        return DBSecret.builder()
                .url(env.getProperty("spring.datasource.url"))
                .username(env.getProperty("spring.datasource.username"))
                .password(env.getProperty("spring.datasource.password"))
                .driverClass(env.getProperty("spring.datasource.driverClassName"))
                .build();
    }

    @Bean
    @Profile("dev")
    public DataSource dataSource(DBSecret dbSecret) {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl(dbSecret.getUrl());
        hikariConfig.setUsername(dbSecret.getUsername());
        hikariConfig.setPassword(dbSecret.getPassword());
        hikariConfig.setDriverClassName(dbSecret.getDriverClass());
        return new HikariDataSource(hikariConfig);
    }

    @Bean
    @Profile("test")
    public DataSource dataSourceTest(){
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName("org.h2.Driver");
        hikariConfig.setJdbcUrl("jdbc:h2:mem:db;DB_CLOSE_DELAY=-1");

        return new HikariDataSource(hikariConfig);
    }
}
