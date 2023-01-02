package com.halilkrkn.springbootintro.api.controllers;

import com.halilkrkn.springbootintro.data.entities.Categories;
import com.halilkrkn.springbootintro.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/categories")
    public List<Categories> getCategory() {
        return categoryService.getCategories();
    }

    @PostMapping("/add")
    public void add(@RequestBody Categories categories) {
        this.categoryService.add(categories);
    }

    @PostMapping("/update")
    public void update(@RequestBody Categories categories) {
        this.categoryService.update(categories);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Categories categories) {
        this.categoryService.delete(categories);
    }

    @GetMapping("/categories/{id}")
    public Categories getById(@PathVariable int id) {
        return this.categoryService.getById(id);
    }

}
