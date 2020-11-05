package my.lesson.springlesson2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import my.lesson.springlesson2.repository.CarRepository;
import my.lesson.springlesson2.repository.PersonRepository;

@SpringBootApplication
public class Springlesson2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springlesson2Application.class, args);
	}

}
