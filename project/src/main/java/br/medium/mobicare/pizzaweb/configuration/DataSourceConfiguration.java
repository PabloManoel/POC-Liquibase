package br.medium.mobicare.pizzaweb.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAutoConfiguration
@EnableTransactionManagement(mode = AdviceMode.PROXY)
@ComponentScan(basePackages = {"br.medium.mobicare"})
@EntityScan({"br.medium.mobicare.pizzaweb.entity"})
@EnableJpaRepositories({"br.medium.mobicare.pizzaweb.repository"})
public class DataSourceConfiguration {
	
	@Value("${spring.datasource.driver-class-name}")
	private String dbDriverClassName;
	
	@Value("${spring.datasource.username}")
	private String dbUserName;
	
	@Value("${spring.datasource.password}")
	private String dbPassword;
	
	@Value("${spring.datasource.url}")
	private String dbUrl;

}
