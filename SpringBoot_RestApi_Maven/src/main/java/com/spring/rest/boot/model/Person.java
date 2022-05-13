package com.spring.rest.boot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor(staticName = "build")
@Entity
@Table(name = "Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
String id;
    @NotBlank(message = "firstName is mandatory")
String firstName;
    @NotBlank(message = "lastName is mandatory")
String lastName;
    @Range(min=10, max=100)
int age;
}
