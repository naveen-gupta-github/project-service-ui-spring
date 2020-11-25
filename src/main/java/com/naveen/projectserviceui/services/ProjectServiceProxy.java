package com.naveen.projectserviceui.services;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.naveen.projectserviceui.models.Project;


@Service
@FeignClient(name="project-service", url="localhost:8080")
public interface ProjectServiceProxy  {

	 @GetMapping("/projects")
	/* @PreAuthorize("hasRole('ROLE_operator')")*/
	 public List<Project> getAllProjects();
}
