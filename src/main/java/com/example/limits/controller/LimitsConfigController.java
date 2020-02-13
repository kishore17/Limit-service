package com.example.limits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.limits.config.Configuration;
import com.example.limits.model.LimitConfig;

@RestController
public class LimitsConfigController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfig retrieveLimitsFromConfig() {
		return new LimitConfig(configuration.getMaximum(),configuration.getMinimum());
	}
}
