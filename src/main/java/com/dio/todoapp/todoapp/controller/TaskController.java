package com.dio.todoapp.todoapp.controller;

import com.dio.todoapp.todoapp.exception.ResourceNotFound;
import com.dio.todoapp.todoapp.model.Task;
import com.dio.todoapp.todoapp.repository.TaskRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1/task")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping
    public List<Task> listAllTasks(){
        return taskRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) throws ResourceNotFound {
        Task task = taskRepository.findById(id).orElseThrow(() -> new ResourceNotFound("Task not Found:: " + id));
        return ResponseEntity.ok().body(task);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Task createTask(@Valid @RequestBody Task task){
        return taskRepository.save(task);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task task) throws ResourceNotFound {
        Task taskToSave = taskRepository.findById(id).orElseThrow(() -> new ResourceNotFound("Task not Found:: " + id));

        taskToSave.setName(task.getName());
        taskToSave.setDescription(task.getDescription());
        taskToSave.setStartDate(task.getStartDate());
        taskToSave.setDueDate(task.getDueDate());
        taskToSave.setUrgency(task.getUrgency());

        final Task savedTask = taskRepository.save(taskToSave);

        return ResponseEntity.ok(savedTask);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTask(@PathVariable Long id) throws ResourceNotFound {
        Task task = taskRepository.findById(id).orElseThrow(() -> new ResourceNotFound("Task not Found:: " + id));
        taskRepository.deleteById(id);
    }

}
