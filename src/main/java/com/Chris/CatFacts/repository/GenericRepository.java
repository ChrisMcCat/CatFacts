package com.Chris.CatFacts.repository;

import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface GenericRepository<T, K> extends Repository<T, K> {

    T save(T value);

    Optional<T> findById(K id);
}
