package com.example.backend.repository.jpa;

import com.example.backend.model.Switch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface SwitchRepository extends JpaRepository<Switch,Long> {
    Optional<Switch> findByName(String name);
    void deleteByName(String name);

}
