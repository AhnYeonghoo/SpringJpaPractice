package com.example.gradleproject;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class TodoController {

    private final TodoRepository todoRepository;

    @RequestMapping("/todo")
    public String list(Model model) {
        List<TodoEntity> todoEntityList = this.todoRepository.findAll();
        model.addAttribute("todoEntityList", todoEntityList);
        return "todolist";
    }

    @RequestMapping("/")
    public String root() {
        return "redirect:/todo";
    }
}
