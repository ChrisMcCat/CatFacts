package com.Chris.CatFacts.service;

import com.Chris.CatFacts.controller.Facts;
import com.Chris.CatFacts.repository.FactsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactsService {

    private FactsRepository factsRepository;

    public FactsService(FactsRepository factsRepository) {
        this.factsRepository = factsRepository;
    }

    public Iterable<Facts> list() {
        return factsRepository.findAll();
    }

    public Facts save(Facts facts) {
        return factsRepository.save(facts);
    }

    public void save(List<Facts> facts) {
        return factsRepository.save(facts);
    }
}
