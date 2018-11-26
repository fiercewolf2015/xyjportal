package com.xyj.portal.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailServiceImpl implements MailService{

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    private JavaMailSender mailSender;
	
	@Value("${mail.fromMail.addr}")
    private String from;
	
	@Value("${mail.toMail.addr}")
    private String to;
	
	@Override
	public void sendSimpleMail(String email, String name, String content) {
		SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject("来自官网:"+name+" 的留言");
        message.setText(content+"\n邮箱:"+email);
        
        try {
            mailSender.send(message);
            logger.info("邮件已经发送,from {}",email);
        } catch (Exception e) {
            logger.error("发送邮件时发生异常！", e);
        }
		
	}

}
