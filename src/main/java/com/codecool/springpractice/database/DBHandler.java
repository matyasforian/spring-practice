package com.codecool.springpractice.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

// Used to hold DB access methods. Subannotation of @Component
// The extra functionality compared to @Component is that any platform specific exceptions are caught and then
// rethrown as one of Spring’s unchecked data access exceptions.
@Repository
public class DBHandler {

    private SampleORMRepository repository;

    @Autowired
    public DBHandler(SampleORMRepository repository) {
        this.repository = repository;

        // sample DB operations, this could be anywhere
        deleteAll();
        saveSampleORMEntity(new SampleORMEntity("Jack", "Smith"));
        saveSampleORMEntity(new SampleORMEntity("Adam", "Johnson"));
        saveSampleORMEntity(new SampleORMEntity("Kim", "Smith"));
        saveSampleORMEntity(new SampleORMEntity("David", "Williams"));
        saveSampleORMEntity(new SampleORMEntity("Peter", "Davis"));
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
