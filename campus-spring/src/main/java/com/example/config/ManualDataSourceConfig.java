package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class ManualDataSourceConfig {
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setUrl("jdbc:mysql://localhost:3306/campus_shop");
        ds.setUsername("root");
        ds.setPassword("Wwt001129");
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return ds;
    }
}