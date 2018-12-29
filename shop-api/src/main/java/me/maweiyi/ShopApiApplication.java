package me.maweiyi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("me.maweiyi.mapper")
public class ShopApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(ShopApiApplication.class, args);
  }

}

