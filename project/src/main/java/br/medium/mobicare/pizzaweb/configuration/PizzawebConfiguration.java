package br.medium.mobicare.pizzaweb.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@SpringBootConfiguration
@ComponentScan(basePackages = {"br.medium.mobicare"})
public class PizzawebConfiguration {
	
	@Value("${spring.datasource.driver-class-name}")
	private String dbDriverClassName;
	
	@Value("${spring.datasource.username}")
	private String dbUserName;
	
	@Value("${spring.datasource.password}")
	private String dbPassword;
	
	@Value("${spring.datasource.url}")
	private String dbUrl;
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		 
	    dataSource.setDriverClassName(dbDriverClassName);
	    dataSource.setUsername(dbUserName);
	    dataSource.setPassword(dbPassword);
	    dataSource.setUrl(dbUrl); 
	    return dataSource;
	}

}
