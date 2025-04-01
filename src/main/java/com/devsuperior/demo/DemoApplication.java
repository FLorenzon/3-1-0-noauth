package com.devsuperior.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication /*implements CommandLineRunner*/{
	
	/*@Autowired
	private PasswordEncoder passwordEncoder;*/

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		System.out.println("ENCODER = " + passwordEncoder.encode("123456"));
		
	boolean result = passwordEncoder.matches("123456", "$2a$10$0BQnB4HAG2sMqrqzlp03suixR3MlYJ4foPeVqdCpNDRcb5HVQ7abu");
	
	System.out.println("RESULTADO = " + result);
	}*/
}
