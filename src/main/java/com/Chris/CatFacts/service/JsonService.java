package com.Chris.CatFacts.service;

import com.Chris.CatFacts.domain.Facts;
import com.Chris.CatFacts.repository.JsonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JsonService {

    private JsonRepository jsonRepository;

    public JsonService(JsonRepository jsonRepository) {
        this.jsonRepository = jsonRepository;
    }

    public Iterable<Facts> list() {
        return jsonRepository.findAll();
    }

    public Facts save(Facts facts) {
        return jsonRepository.save(facts);
    }

    public void save(List<Facts> facts) {
        jsonRepository.saveAll(facts);
    }
}
