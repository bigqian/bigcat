//package com.bigcat.junittest.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//@EnableTransactionManagement
//public class JDBCConfig {
//
//	@Autowired
//	private DataSource dataSource;
//
//	@Bean
//	public DataSourceTransactionManager transactionManager() {
//		return new DataSourceTransactionManager(dataSource);
//	}
//
//}
