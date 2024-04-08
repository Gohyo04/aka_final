package com.aka.app;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class TestController {
	@GetMapping("/")
	public String test (Model model) {
		return "temp/sample";
	}
	
	@GetMapping("/login")
	public String test2() {
		return "member/first";
	}
	@GetMapping("/login/memberLogin")
	public String test3() {
		return "member/memberLogin";
	}
	@GetMapping("/login/memberRegister")
	public String test4() {
		return "member/memberRegister";
	}
}
