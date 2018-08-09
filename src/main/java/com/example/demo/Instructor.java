package com.example.demo;

import org.hibernate.mapping.Set;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @NotNull
    @Size(min=4)
    private String name;

    @OneToMany(mappedBy = "instructor", fetch = FetchType.EAGER, orphanRemoval = true)
    public java.util.Set<Course> courses;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(java.util.Set<Course> courses) {
        this.courses = courses;
    }
}
