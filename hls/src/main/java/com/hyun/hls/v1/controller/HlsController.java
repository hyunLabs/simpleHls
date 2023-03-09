package com.hyun.hls.v1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HlsController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
