package com.example.hellospring;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
public class User implements Serializable {

    @Id
    private String name;
    private Integer age;
}
