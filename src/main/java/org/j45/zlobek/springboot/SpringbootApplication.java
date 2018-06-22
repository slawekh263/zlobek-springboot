package org.j45.zlobek.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication
{

	private Updater updater;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
		// updater.doUpdate();
	}
}
