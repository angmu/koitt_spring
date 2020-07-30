package com.javalec.ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("server")
public class AppConfig2 {
	@Bean
	public ServerInfo serverInfo() {
		ServerInfo serverInfo = new ServerInfo();
		serverInfo.setIpNum("211.208.107.1");
		serverInfo.setPortNum("8080");

		return serverInfo;
	}
}
