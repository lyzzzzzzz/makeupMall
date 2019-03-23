package com.lyz.makeupMall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.lyz.makeupMall.mapper")
@SpringBootApplication
public class MakeupMallApplication {

	public static void main(String[] args) {
		SpringApplication.run(MakeupMallApplication.class, args);
	}

}
