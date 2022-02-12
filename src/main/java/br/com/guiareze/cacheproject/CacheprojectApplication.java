package br.com.guiareze.cacheproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CacheprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacheprojectApplication.class, args);
	}

}
