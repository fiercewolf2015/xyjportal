package com.xyj.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xyj.portal.controller.dto.MailDto;
import com.xyj.portal.service.MailService;

@RestController
@RequestMapping("/mail")
public class MailController {

	@Autowired
	private MailService mailService;

	@RequestMapping(value = "/send", method = RequestMethod.POST)
	public void sendMail(@ModelAttribute MailDto mailDto){
		mailService.sendSimpleMail(mailDto.getEmail(), mailDto.getName(), mailDto.getMessage());
	}

}
