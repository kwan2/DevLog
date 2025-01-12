package com.devlog.common.storage.config

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
internal class MainDataSourceConfig {

    @Bean
    @ConfigurationProperties(prefix = "storage.datasource.main")
    fun mainHikariConfig() : HikariConfig {
        return HikariConfig()
    }

    @Bean(name = ["mainDataSource"])
    fun mainDataSource(
        @Qualifier("mainHikariConfig") config: HikariConfig
    ): HikariDataSource {
        return HikariDataSource(config)
    }
}