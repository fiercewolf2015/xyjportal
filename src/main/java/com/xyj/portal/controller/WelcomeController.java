package com.xyj.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xyj.portal.controller.dto.MailDto;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("mailDto", new MailDto());
		return "index";
	}

}
