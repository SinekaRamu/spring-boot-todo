package com.sine.spring_boot_todo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sine.spring_boot_todo.models.TodoItem;

@Repository
public interface TodoitemRepository extends CrudRepository<TodoItem, Long> {

}