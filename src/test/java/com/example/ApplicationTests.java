package com.example;

import com.Starter;
import com.config.Properties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Starter.class)
public class ApplicationTests {

    @Autowired
    private Properties blogProperties;

    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    @Test
    public void getHello() throws Exception {
        logger.debug(blogProperties.getName());
        logger.info(blogProperties.getTitle());
    }
}