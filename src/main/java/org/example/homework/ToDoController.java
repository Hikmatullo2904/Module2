package org.example.homework;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ToDoController {

    private final List<ToDo> toDoList;

    public ToDoController(List<ToDo> toDoList) {
        this.toDoList = toDoList;
    }

    @GetMapping("/todos")
    @ResponseBody
    public String getToDoList() {
        return new ArrayList<>(List.of(new ToDo("kitob o'qish", LocalDate.of(2023, 12, 28)),
                new ToDo("ko'd yozish", LocalDate.of(2023, 12, 28)))).toString();
    }
}
