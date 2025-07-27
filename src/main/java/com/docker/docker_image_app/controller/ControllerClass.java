package com.docker.docker_image_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/docker/v1")
public class ControllerClass 
{
	@GetMapping(value="/getMessage")
	public String returnMessageFromDockerImage()
	{
		return "Successfully returning message from docker image:";
	}

}
