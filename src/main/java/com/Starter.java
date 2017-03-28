package com;

import com.config.Properties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@MapperScan("com.mapper")//扫描mapper文件
@EnableTransactionManagement// 启注解事务管理
@EnableScheduling//启用定时任务的配置
//@EnableAsync//Task任务异步进行
@EnableConfigurationProperties({Properties.class})
public class Starter {

	public static void main(String[] args) {
		SpringApplication.run(Starter.class, args);
	}
}
