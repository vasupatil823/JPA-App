package com.vasu.configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableAspectJAutoProxy
@EnableWebMvc
@ComponentScan({"com.vasu"})
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
	}