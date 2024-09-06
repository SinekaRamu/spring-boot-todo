package com.sine.spring_boot_todo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sine.spring_boot_todo.models.TodoItem;
import com.sine.spring_boot_todo.repositories.TodoitemRepository;

@Component
public class TodoDataLoader implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(TodoDataLoader.class);

    @Autowired
    TodoitemRepository todoitemRepository;

    @Override
    public void run(String... args) throws Exception {
        loadSeedData();
    }

    private void loadSeedData() {
        if (todoitemRepository.count() == 0) {
            TodoItem todoItem1 = new TodoItem("get the data");
            TodoItem todoItem2 = new TodoItem("upload the data");

            todoitemRepository.save(todoItem1);
            todoitemRepository.save(todoItem2);
        }

        logger.info("Number of Todo Items: {}", todoitemRepository.count());
    }

}
