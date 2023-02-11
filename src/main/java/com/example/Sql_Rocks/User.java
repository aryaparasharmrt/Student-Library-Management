package com.example.Sql_Rocks;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "user_info")
public class User {

    @Id
    private String id;

    private String name;

    private int age;

    public User(){

    }

    public User(String id, String name, int age){

        this.id = id;
        this.name = name;
        this.age = age;

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

