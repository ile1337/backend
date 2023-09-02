package com.example.backend.service;

import com.example.backend.model.Switch;
import java.util.List;

import java.util.Optional;

public interface ProductService {
    List<Switch> findAll();

    Optional<Switch> findById(Long id);

    Optional<Switch> findByName(String name);

    void deleteById(Long id);
}
