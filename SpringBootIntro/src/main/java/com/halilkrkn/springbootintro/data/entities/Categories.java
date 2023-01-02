package com.halilkrkn.springbootintro.data.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name = "categories")
@Getter
@Setter
@AllArgsConstructor // İlgili sınıfın contstructor'lı yani parametreli halini oluşturuyor. Örn. Brand(int,String) gibi.
@NoArgsConstructor
public class Categories {

    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int categoryId;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "description")
    private String categoryDescription;

}
