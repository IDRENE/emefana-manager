package com.idrene.emefana.manager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.idrene.emefana.manager.EmefanaManagerApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EmefanaManagerApplication.class)
@WebAppConfiguration
public class EmefanaManagerApplicationTests {

	@Test
	public void contextLoads() {
	}

}
