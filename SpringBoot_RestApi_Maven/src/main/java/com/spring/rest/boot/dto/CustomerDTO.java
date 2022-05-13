package com.spring.rest.boot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class CustomerDTO {
    private Integer id;
    @NotNull(message = "status is mandatory")
    private String status;
    @Min(10)
    @Max(80)
    private double totalFare;
    @NotNull(message = "pnrNo is mandatory")
    private String pnrNo;
}
