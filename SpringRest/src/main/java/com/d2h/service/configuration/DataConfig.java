/*package com.d2h.service.configuration;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan("com.d2h.service.persistance")
public class DataConfig {

	@Bean
	public DataSource dataSource() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriverClass(com.mysql.jdbc.Driver.class);
		dataSource.setUsername("deliver2_admin");
		dataSource.setUrl("jdbc:mysql://mysql3000.mochahost.com:3306/deliver2_homedb");
		dataSource.setPassword("admin");
		
		BasicDataSource dataSource = new BasicDataSource();
	       dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	       dataSource.setUrl("jdbc:mysql://mysql3000.mochahost.com:3306/deliver2_homedb");
	       dataSource.setUsername("deliver2_admin");
	       dataSource.setPassword("admin");
	       return dataSource;

		// populate some data
//		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		System.out.println("Creating tables Address");
		jdbcTemplate.execute("drop table vender if exists");
		jdbcTemplate.execute("create table vender(id serial, firstName varchar(255), lastName varchar(255), email varchar(255), mobileNumber varchar(10))");
		jdbcTemplate.update("INSERT INTO vender(firstName, lastName, email, mobileNumber) values (?,?,?,?)", "Vender1", "Dmart", "hemanta04@gmail.com", "9987330777");
		jdbcTemplate.update("INSERT INTO vender(firstName, lastName, email, mobileNumber) values (?,?,?,?)", "Vender2", "Reliance Fresh", "hemanta05@gmail.com", "9987330333");

		
		System.out.println("Creating tables users");
		jdbcTemplate.execute("drop table users if exists");
//		jdbcTemplate.execute("create table users(id serial, firstName varchar(255), lastName varchar(255), email varchar(255), mobileNumber varchar(10))");
		
//		System.out.println("Table Created.");
		
		
		jdbcTemplate.update("INSERT INTO `users`(`id`, `firstname`, `lastname`, `email`, `mobile`) VALUES (2,"+"Hemanta", "Patasani", "hemanta@gmail.com", "9987330777");
		jdbcTemplate.update("INSERT INTO `users`(`id`, `firstname`, `lastname`, `email`, `mobile`) VALUES (3,"+"himakshi", "Patasani", "hemanta@gmail.com", "9987330777");

		System.out.println("Creating tables vender");
		jdbcTemplate.execute("drop table vender if exists");
		jdbcTemplate.execute("create table vender(id serial, firstName varchar(255), lastName varchar(255), email varchar(255), mobileNumber varchar(10))");
		jdbcTemplate.update("INSERT INTO vender(firstName, lastName, email, mobileNumber) values (?,?,?,?)", "Vender1", "Dmart", "hemanta04@gmail.com", "9987330777");
		jdbcTemplate.update("INSERT INTO vender(firstName, lastName, email, mobileNumber) values (?,?,?,?)", "Vender2", "Reliance Fresh", "hemanta05@gmail.com", "9987330333");

//		return dataSource;
	}

	@Bean
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}

	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setTypeAliasesPackage("com.d2h.service.domain");
		return sessionFactory;
	}
}
*/