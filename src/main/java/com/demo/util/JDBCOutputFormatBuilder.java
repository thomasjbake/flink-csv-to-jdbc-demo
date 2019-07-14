package com.demo.util;

import org.apache.flink.api.java.io.jdbc.JDBCOutputFormat;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JDBCOutputFormatBuilder {

    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.driverClassName}")
    private String drivername;
    @Value("${spring.datasource.url}")
    private String jdbcUrl;

    public JDBCOutputFormat buildJDBCOutputFormat(String query) {
        return JDBCOutputFormat.buildJDBCOutputFormat()
                .setUsername(username)
                .setPassword(password)
                .setDrivername(drivername)
                .setDBUrl(jdbcUrl)
                .setQuery(query)
                .finish();
    }
}
