package com.Chris.CatFacts.repository;

import com.Chris.CatFacts.domain.Facts;
import org.springframework.data.repository.CrudRepository;

public interface JsonRepository extends CrudRepository<Facts, Long> {
}
