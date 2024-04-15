package com.practice.dynamodb.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties("aws.dynamodb")
@Setter
@Getter
public class AwsProperties {
	
	private String accessKey;
	
	private String secret;
	
	private String region;
	
	private String endpoint;
}
