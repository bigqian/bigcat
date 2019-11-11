package com.bigcat.junittest.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

@Configuration
public class DruidConfig {

	@Primary
	@Bean
	@ConfigurationProperties("spring.datasource.druid")
	public DataSource dataSourceOne() {
		return DruidDataSourceBuilder.create().build();
	}

//	@Bean
//	@ConfigurationProperties("spring.datasource.druid.two")
//	public DruidDataSource dataSourceTwo() {
//		return DruidDataSourceBuilder.create().build();
//	}
}
