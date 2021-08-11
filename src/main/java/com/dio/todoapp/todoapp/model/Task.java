package com.dio.todoapp.todoapp.model;

import lombok.*;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Builder
@Table(name="task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private String startDate;
    private String dueDate;
    private String urgency;

    @Override
    public String toString(){
        return "Task {id: " + this.id
                + ", name: " + this.name
                + ", description: " + this.description
                + ", startDate: " + this.startDate
                + ", dueDate: " + this.dueDate
                + ", urgency: " + this.urgency
                + "}";
    }

}
