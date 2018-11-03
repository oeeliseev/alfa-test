package com.test.alfa.alfa.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @NotBlank
    private String name;

    private String surname;

    private Integer age;
}
