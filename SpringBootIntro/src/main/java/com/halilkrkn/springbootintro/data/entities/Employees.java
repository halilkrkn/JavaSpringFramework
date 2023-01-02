package com.halilkrkn.springbootintro.data.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

import java.text.DateFormat;
import java.util.Date;

@Entity
@Table(name = "employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employees {


    @Id
    @Column(name = "employee_id" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name" )
    private String firstName;

    @Column(name = "title" )
    private String title;

    @Column(name = "title_of_courtesy" )
    private String titleOfCourtesy;

    @Column(name = "birth_date" )
    private Date birthDate;

    @Column(name = "hire_date" )
    private Date hireDate;

    @Column(name = "address" )
    private String address;

    @Column(name = "city" )
    private String city;

    @Column(name = "region" )
    private String region;

    @Column(name = "postal_code" )
    private String postalCode;

    @Column(name = "country" )
    private String country;

    @Column(name = "home_phone" )
    private String homePhone;

    @Column(name = "extension" )
    private String extension;

    @Column(name = "photo" )
    private String photo;

    @Column(name = "notes" )
    private String notes;

    @Column(name = "photo_path" )
    private String photoPath;




}
