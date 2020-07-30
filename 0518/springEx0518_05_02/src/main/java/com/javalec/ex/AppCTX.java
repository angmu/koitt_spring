package com.javalec.ex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class AppCTX {
	@Value("${LINE}")
	private String line;
	@Value("${STATN_NM}")
	private String statn_nm;
	@Value("${ADRES}")
	private String adres;
	@Value("${RDNMADR}")
	private String rdnmadr;
	@Value("${TELNO}")
	private String telno;

	@Bean
	public static PropertySourcesPlaceholderConfigurer configurer() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();

		Resource location = new ClassPathResource("subway.properties");
		configurer.setLocation(location);

		return configurer;
	}

	@Bean
	public SubwayInfo subwayInfo() {
		SubwayInfo subwayInfo = new SubwayInfo();
		subwayInfo.setLine(line);
		subwayInfo.setStatn_nm(statn_nm);
		subwayInfo.setAdres(adres);
		subwayInfo.setRdnmadr(rdnmadr);
		subwayInfo.setTelno(telno);

		return subwayInfo;
	}
}
