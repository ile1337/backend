package com.example.backend.service.impl;

import com.example.backend.service.ProductService;
import com.example.backend.model.Switch;
import com.example.backend.repository.jpa.SwitchRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProductServiceImpl implements ProductService {

    private final SwitchRepository switchRepository;

    public ProductServiceImpl(SwitchRepository switchRepository) {
        this.switchRepository = switchRepository;
    }

    @Override
    public List<Switch> findAll() {
        return this.switchRepository.findAll();
    }

    @Override
    public Optional<Switch> findById(Long id) {
        return this.switchRepository.findById(id);
    }

    @Override
    public Optional<Switch> findByName(String name) {
        return this.switchRepository.findByName(name);
    }

    @Override
    public void deleteById(Long id) {
        this.switchRepository.deleteById(id);
    }
}
