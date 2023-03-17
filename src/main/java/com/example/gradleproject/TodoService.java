package com.example.gradleproject;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public List<TodoEntity> getList() {
        return this.todoRepository.findAll();
    }

    public void create(String content) {
        TodoEntity todoEntity = new TodoEntity();
        todoEntity.setContent(content);
        todoEntity.setCompleted(false);
        this.todoRepository.save(todoEntity);
    }

    @Transactional
    public void delete(Integer id){
        TodoEntity toDoEntity = todoRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("해당 아이템이 없습니다. id=" + id));
        this.todoRepository.delete(toDoEntity);
    }

}
