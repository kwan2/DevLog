package com.devlog.common.storage.config

import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
internal class GraphDataSourceConfig {

    @Bean(name = ["graphDataSource"])
    fun graphDataSource(): DataSource {
        val dataSourceProperties = GraphDataSourceProperties()
        return DataSourceBuilder.create()
            .url(dataSourceProperties.url)
            .driverClassName(dataSourceProperties.driverClassName)
            .build()
    }
}