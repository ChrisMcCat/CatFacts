package com.Chris.CatFacts.controller;

import com.Chris.CatFacts.service.FactsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/facts")
public class Facts {

    private FactsService factsService;

    public Facts(FactsService factsService) {
        this.factsService = factsService;
    }
}
