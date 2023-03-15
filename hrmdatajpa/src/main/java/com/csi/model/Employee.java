package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue
    private long empId;

    @NotNull
    @Size(min = 2, message = "Employee First Name should be atleast 2 character")
    private String empFirstName;

    private String empLastName;

    private String empAddress;

    @Range(min = 1000000000, max = 9999999999L, message = "Employee Contact Number must be 10 digit")
    @Column(unique = true)
    private long empContactNumber;

    private int empAge;

    private double empSalary;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date empDOB;

    @Email(message = "Email Id must be valid")
    @Column(unique = true)
    private String empEmailId;

    @Size(min = 6, message = "Password should be atleast 6 character")
    private String empPassword;


}
