package org.example.homework;

import java.time.LocalDate;
public class ToDo {
    private String task;
    private LocalDate date;

    public ToDo(String task, LocalDate date) {
        this.task = task;
        this.date = date;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "task='" + task + '\'' +
                ", date=" + date +
                '}';
    }
}
