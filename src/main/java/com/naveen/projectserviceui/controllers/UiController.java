package com.naveen.projectserviceui.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.projectserviceui.models.Project;
import com.naveen.projectserviceui.services.ProjectServiceProxy;

import java.util.List;

@Controller						//We're using Thymleaf so @Controller is necessary instead of @RestController
@EnableOAuth2Sso
public class UiController extends WebSecurityConfigurerAdapter {

	@Autowired
	ProjectServiceProxy proxy;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/")
			.permitAll()
			.anyRequest()
			.authenticated();
	}

	@GetMapping("/")
	public String loadHomePage() {
		
		return "index";
	}
	
	@GetMapping("/secure")
	public String loadSecurePage() {
		
		return "secure";
	}
	
	
	@GetMapping("/projects")
	public ResponseEntity<List<Project>> loadProjects(){
		
	return	ResponseEntity.ok()
									.body(proxy.getAllProjects());
		
		
		
	}
	

	
}
