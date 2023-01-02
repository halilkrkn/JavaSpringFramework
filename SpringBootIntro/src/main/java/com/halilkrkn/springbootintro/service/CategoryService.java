package com.halilkrkn.springbootintro.service;

import com.halilkrkn.springbootintro.data.entities.Categories;

import java.util.List;

public interface CategoryService {
    List<Categories> getCategories();
    void add(Categories categories);
    void update(Categories categories);
    void delete(Categories categories);
    Categories getById(int id);

}
