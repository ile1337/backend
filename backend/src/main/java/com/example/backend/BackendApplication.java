package com.example.backend;

import com.example.backend.model.Switch;
import com.example.backend.model.User;
import com.example.backend.repository.jpa.SwitchRepository;
import com.example.backend.repository.jpa.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.example.backend.model.Role.ROLE_ADMIN;
import static com.example.backend.model.Role.ROLE_USER;

@SpringBootApplication
public class BackendApplication {



    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Bean
    public Switch demoSwitchData(SwitchRepository repo) {

        repo.save(new Switch(Long.parseLong("1"),"cherry mx black",89));
        repo.save(new Switch(Long.parseLong("2"),"cherry mx blue",60));
        repo.save(new Switch(Long.parseLong("3"),"Razer Green Switch",50));
        repo.save(new Switch(Long.parseLong("4"),"cherry mx clear",50));

        return repo.save(new Switch(Long.parseLong("4"),"Alps SKCL Yellow",50));
    }

    @Bean
    public User demoUserData(UserRepository repo){

        repo.save(new User(Long.parseLong("1"),"Stanko","StankoTheBEst","123",ROLE_USER));
        return repo.save(new User(Long.parseLong("2"),"Panko","Pankooo","123",ROLE_ADMIN));
    }

}
