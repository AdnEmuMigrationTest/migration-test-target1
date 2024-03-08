package ch.adnovum.migrationtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MigrationTestApplication {

	private String _invalid_variable = "abc";

	public static void main(String[] args) {
		SpringApplication.run(MigrationTestApplication.class, args);
	}

}
