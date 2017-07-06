package com.codecool.springpractice.database;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

//An interface to access the SampleORMEntity table
public interface SampleORMRepository extends CrudRepository<SampleORMEntity, Long> {

    List<SampleORMEntity> findByLastName(String lastName);

}