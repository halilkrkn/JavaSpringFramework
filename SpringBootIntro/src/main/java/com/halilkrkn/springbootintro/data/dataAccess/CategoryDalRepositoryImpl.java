package com.halilkrkn.springbootintro.data.dataAccess;

import com.halilkrkn.springbootintro.data.entities.Categories;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public class CategoryDalRepositoryImpl implements CategoryDalRepository {

    private final EntityManager entityManager;

    @Autowired
    public CategoryDalRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // Tüm kategorileri listelemek için getCategories fonksiyonu oluşturuldu.
    @Override
    @Transactional // AOP - Aspect Oriented Programming
    public List<Categories> getCategories() {
        // Burada JPA ile hibernate işlemleri yaptık. Yani burda database'den category table'ının listesini çekiyoruz.
        Session session = entityManager.unwrap(Session.class);
        List<Categories> categories = session.createQuery("from Categories", Categories.class).getResultList();
        return categories;
    }

    @Override
    @Transactional // AOP - Aspect Oriented Programming
    public void add(Categories categories) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(categories);
    }

    @Override
    public void update(Categories categories) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(categories);
    }

    @Override
    public void delete(Categories categories) {
        Session session = entityManager.unwrap(Session.class);
        Categories categoriesToDelete = session.get(Categories.class,categories.getCategoryId());
        session.delete(categoriesToDelete);
    }

    @Override
    public Categories getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Categories categories = session.get(Categories.class,id);
        return categories;
    }
}
