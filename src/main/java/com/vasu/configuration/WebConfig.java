package com.vasu.configuration;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableAspectJAutoProxy
@EnableWebMvc
@ComponentScan({"com.vasu"})
@PropertySource(value = { "classpath:jdbc.properties" ,"classpath:query.properties"})
public class WebConfig extends WebMvcConfigurerAdapter {
	@Autowired
	public Environment env;
	@Bean
	 public InternalResourceViewResolver viewResolver() {
	 InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
     viewResolver.setViewClass(JstlView.class);
     viewResolver.setPrefix("/WEB-INF/view/");
     viewResolver.setSuffix(".jsp");
return viewResolver;
}
	@Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("jdbc.driver"));
        dataSource.setUrl(env.getProperty("jdbc.url"));
        dataSource.setUsername(env.getProperty("jdbc.username"));
        dataSource.setPassword(env.getProperty("jdbc.password"));
        return dataSource;
    }
	@Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.setResultsMapCaseInsensitive(true);
        return jdbcTemplate;
    }
	}