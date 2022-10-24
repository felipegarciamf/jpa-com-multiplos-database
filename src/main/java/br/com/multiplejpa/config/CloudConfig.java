package br.com.multiplejpa.config;

import javax.sql.DataSource;

import org.springframework.cloud.config.java.AbstractCloudConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudConfig extends AbstractCloudConfig {

	
	@Bean(name = "pa001")
	public DataSource bancoDeDadosDB001() {
		return connectionFactory().dataSource("pa001");
	}
	
	@Bean(name = "pa002")
	public DataSource bancoDeDadosDB002() {
		return connectionFactory().dataSource("pa002");
	}

}
