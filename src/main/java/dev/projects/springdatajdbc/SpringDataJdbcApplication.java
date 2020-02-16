package dev.projects.springdatajdbc;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static dev.projects.springdatajdbc.State.FUTURE;
import static dev.projects.springdatajdbc.State.IN_PROGRESS;

@SpringBootApplication
public class SpringDataJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJdbcApplication.class, args);
	}


	@Bean
	ApplicationRunner applicationRunner(ProjectRepository repository) {
		return args -> {
			Project p1 = Project.of("spring-data-jdbc", "demo project", IN_PROGRESS);
			Project p2 = Project.of("website", "build personal website", FUTURE);
			System.out.println(repository.save(p1));
			System.out.println(repository.save(p2));
			System.out.println(repository.findByState(IN_PROGRESS.name()));
		};
	}
}
