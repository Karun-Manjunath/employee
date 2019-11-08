package com.lowes.payment.employee;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
public class Employee {

    @Digits(integer = 4,fraction = 0)
    public int id;
    public String name;
    public float amt;
    public int sup_id;


}
