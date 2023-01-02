package com.halilkrkn.springbootintro.data.dataAccess;

import com.halilkrkn.springbootintro.data.entities.Employees;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private EntityManager entityManager;

    @Autowired
    public EmployeeRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Employees> getEmployee() {
        Session session = entityManager.unwrap(Session.class);
        List<Employees> employees = session.createQuery("from Employees", Employees.class).getResultList();
        return employees;
    }
}
