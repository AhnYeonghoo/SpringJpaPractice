package com.example.gradleproject;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public List<TodoEntity> getList() {
        return this.todoRepository.findAll();
    }
}
