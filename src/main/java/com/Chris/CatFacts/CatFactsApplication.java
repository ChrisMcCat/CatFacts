package com.Chris.CatFacts;

import com.Chris.CatFacts.domain.Facts;
import com.Chris.CatFacts.service.JsonService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class CatFactsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatFactsApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(JsonService jsonService) {
		return args -> {
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Facts>> typeReference = new TypeReference<List<Facts>>()();
			InputStream inputStream = TypeReference.class.getResourceAsStream("apijson");
			try {
				List<Facts> facts = mapper.readValue(inputStream,typeReference);
				jsonService.save(facts);
				System.out.println("json saved");
			} catch (IOException e) {
				System.out.println("unable to save " + e.getMessage());
			}
		};
	}
}
