package org.example.Entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.example.Model.Human;
import org.example.Model.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Data implements CommandLineRunner {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    @Transactional
    public void run(String... args) throws Exception {

        Person one = Person.builder().human(Human.builder()
                        .name("Anna")
                        .surname("Ivanova")
                        .age(18)
                        .build())
                .phoneNumber("+7 (111) 111-11-11")
                .cityOfLiving("Moscow")
                .build();

        Person two = Person.builder().human(Human.builder()
                        .name("Olga")
                        .surname("Petrova")
                        .age(25)
                        .build())
                .phoneNumber("+7 (222) 222-22-22")
                .cityOfLiving("Yekaterinburg")
                .build();

//        entityManager.persist(one);

    }
}
