package com.codecool.springpractice.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // Used to hold DB access methods. Subannotation of @Component
public class DBHandler {


    private SampleORMRepository repository;

    @Autowired
    public DBHandler(SampleORMRepository repository) {
        this.repository = repository;
    }

    public void deleteAll() {
        repository.deleteAll();
    }

    public void saveSampleORMEntity(SampleORMEntity entity) {
        repository.save(entity);
    }

    public List<SampleORMEntity> findByLastName(String name) {
        return repository.findByLastName(name);
    }
}
