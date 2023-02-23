package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Employeerepo extends JpaRepository<Employee, Integer> {

}
