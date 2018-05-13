package com.philip.reactiveMongoExample.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.philip.reactiveMongoExample.model.Employee;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {
}
