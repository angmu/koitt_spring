package com.javalec.ex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class AppCTX {

	@Value("${auth}")
	private String auth;
	@Value("${driverClassName}")
	private String driverClassName;
	@Value("${url}")
	private String url;
	@Value("${username1}")
	private String username1;
	@Value("${password}")
	private String password;
	@Value("${name}")
	private String name;
	@Value("${type}")
	private String type;
	@Value("${maxActive}")
	private String maxActive;
	@Value("${maxWait}")
	private String maxWait;

	// 만들어지기전에 외부파일을 미리 가져오기위해서 static
	@Bean
	public static PropertySourcesPlaceholderConfigurer Properties() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();

		Resource[] location = new Resource[2];

		location[0] = new ClassPathResource("server1.properties");
		location[1] = new ClassPathResource("server2.properties");
		// 외부파일이 1개일 경우 Resource location=new ClassPathResource("server1.properties");

		configurer.setLocations(location);

		return configurer;
	}

	@Bean
	public ServerInfo serverInfo() {
		ServerInfo serverInfo = new ServerInfo();

		serverInfo.setAuth(auth);
		serverInfo.setDriverClassName(driverClassName);
		serverInfo.setUrl(url);
		serverInfo.setUsername1(username1);
		serverInfo.setPassword(password);
		serverInfo.setName(name);
		serverInfo.setType(type);
		serverInfo.setMaxActive(maxActive);
		serverInfo.setMaxWait(maxWait);

		return serverInfo;
	}
}
