package com.oddfar.campus;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 源码地址：https://github.com/oddfar/campus-example
 * @author zhiyuan
 */
@SpringBootApplication
@Slf4j
@EnableSwagger2
public class CampusApplication {

    public static void main(String[] args) throws UnknownHostException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(CampusApplication.class, args);
        ConfigurableEnvironment env = applicationContext.getEnvironment();

        log.info("\n----------------------------------------------------------\n\t" +
                        "Application: '{}' is running! Access URLs:\n\t" +
                        "后端地址: \t\thttp://127.0.0.1:{}\n\t" +
                        "----------------------------------------------------------",
                env.getProperty("spring.application.name"),
                env.getProperty("server.port"));
        log.info("-------服务启动完成:{}-------", InetAddress.getLocalHost().getHostAddress());
    }

}
