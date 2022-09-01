package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RestController
public class DemoApplicationTests {
	public static void main(String[] args){
		SpringBootTest.run(DemoApplication)
	}
	@RequestMapping("/")
 String sayHello() {
 	return "Hello Azure!";
 }

}
