package com.bonni.guilherme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bonni.guilherme.personapi.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
