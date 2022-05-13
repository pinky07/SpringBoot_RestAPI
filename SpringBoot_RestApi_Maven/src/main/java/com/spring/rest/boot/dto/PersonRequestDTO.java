package com.spring.rest.boot.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.spring.rest.boot.model.Customer;
import com.spring.rest.boot.model.Person;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class PersonRequestDTO {
    String id;
    @NotBlank(message = "firstName is mandatory")
    String firstName;
    @NotBlank(message = "lastName is mandatory")
    String lastName;
    @Range(min=10, max=100)
    int age;

}
