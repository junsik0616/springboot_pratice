// spring boot를 켜는 메인 함수
// 백엔드 서버를 켠다.
// spring boot initializer 기본적으로 만들어지는 친구
// @SpringBootApplication, @RestController을 자동으로 읽어와서 실행
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
