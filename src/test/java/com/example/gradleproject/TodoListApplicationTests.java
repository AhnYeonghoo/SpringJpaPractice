package com.example.gradleproject;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TodoListApplicationTests {

    @Autowired
    private TodoRepository todoRepository;

    @Test
    void testJpa() {
        TodoEntity todo1 = new TodoEntity();
        todo1.setContent("밥먹기");
        todo1.setCompleted(Boolean.TRUE);
        this.todoRepository.save(todo1);


    }


}
