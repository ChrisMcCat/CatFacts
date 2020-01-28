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
}
