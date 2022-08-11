package com.vaadin.demo.vaadindemoapp.repository;

import com.vaadin.demo.vaadindemoapp.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
