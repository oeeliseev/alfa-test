package com.test.alfa.alfa.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.apache.tomcat.jni.Address;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class User {
    @Id
    private Integer id;
    private String name;
    private String surname;
    private Address address;
    private LocalDate dateOfBirth;
}
