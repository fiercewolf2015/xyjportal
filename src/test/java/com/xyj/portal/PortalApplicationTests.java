package com.xyj.portal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xyj.portal.service.MailService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PortalApplicationTests {

	@Test
	public void contextLoads() {
	}
	

	@Autowired
    private MailService MailService;

    @Test
    public void testSimpleMail() throws Exception {
        MailService.sendSimpleMail("testwibesete@163.com","主题","内容");
    }

}
