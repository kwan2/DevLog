package com.devlog.common.storage.config
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "storage.datasource.config")
class GraphDataSourceProperties {
    lateinit var url: String
    lateinit var driverClassName: String
}
