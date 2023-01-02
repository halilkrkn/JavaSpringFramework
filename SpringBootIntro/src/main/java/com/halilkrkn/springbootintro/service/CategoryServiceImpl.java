package com.halilkrkn.springbootintro.service;

import com.halilkrkn.springbootintro.data.dataAccess.CategoryDalRepository;
import com.halilkrkn.springbootintro.data.entities.Categories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//BBusiness iş kurallarının olduğu yer.
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryDalRepository categoryDalRepository;

    @Autowired
    public CategoryServiceImpl(CategoryDalRepository categoryDalRepository) {
        this.categoryDalRepository = categoryDalRepository;
    }

    @Override
    @Transactional
    public List<Categories> getCategories() {
        return this.categoryDalRepository.getCategories();
    }

    @Override
    @Transactional
    public void add(Categories categories) {
        this.categoryDalRepository.add(categories);
    }

    @Override
    @Transactional
    public void update(Categories categories) {
        this.categoryDalRepository.update(categories);
    }

    @Override
    @Transactional
    public void delete(Categories categories) {
        this.categoryDalRepository.delete(categories);
    }

    @Override
    @Transactional
    public Categories getById(int id) {
        return this.categoryDalRepository.getById(id);
    }
}
