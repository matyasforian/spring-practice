package com.codecool.springpractice.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

// This is how you define access the SampleORMEntity table
public interface SampleORMRepository extends JpaRepository<SampleORMEntity, Long> {

    List<SampleORMEntity> findByLastName(String lastName);

}