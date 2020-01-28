package com.Chris.CatFacts;

import com.Chris.CatFacts.domain.Facts;
import com.Chris.CatFacts.service.JsonService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
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

//	@Bean
//	CommandLineRunner runner(JsonService jsonService) throws UnirestException {
//		HttpResponse<String> response = Unirest.get("https://brianiswu-cat-facts-v1.p.rapidapi.com/facts")
//				.header("x-rapidapi-host", "brianiswu-cat-facts-v1.p.rapidapi.com")
//				.header("x-rapidapi-key", "ab641fc238msh8b82c9ee652a6c2p10f75fjsn4b75aad01ba7")
//				.asString();
//		return args -> {
//			ObjectMapper mapper = new ObjectMapper();
//			TypeReference<List<Facts>> typeReference = new TypeReference<List<Facts>>(){};
//			InputStream inputStream = TypeReference.class.getResourceAsStream(String.valueOf(response));
//			try {
//				List<Facts> facts = mapper.readValue(inputStream,typeReference);
//				jsonService.save(facts);
//				System.out.println("json saved");
//			} catch (IOException e) {
//				System.out.println("unable to save " + e.getMessage());
//			}
//		};
//	}
}
