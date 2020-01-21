package io.shodo.ddd.bbl.words;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class WordsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WordsApplication.class, args);
	}

}
