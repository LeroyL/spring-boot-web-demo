package com.lier.demo.spring.boot.wap;

import com.lier.demo.spring.boot.wap.config.BeetlConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 1800)
@EnableTransactionManagement
@EntityScan(basePackages = {
		"com.lier.demo.spring.boot.core.entity"
})
@EnableJpaRepositories(basePackages = {
		"com.lier.demo.spring.boot.core.repository"
})
@SpringBootApplication(scanBasePackages = {
		"com.lier.demo.spring.boot.core.service",
		"com.lier.demo.spring.boot.wap.service",
		"com.lier.demo.spring.boot.wap.controller"
})
@Import({BeetlConfig.class})
public class WapApplication {

	public static void main(String[] args) {
		SpringApplication.run(WapApplication.class, args);
	}
}
