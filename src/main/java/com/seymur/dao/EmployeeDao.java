package com.seymur.dao;

import com.seymur.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Seymur on 6/1/2018.
 */

@Repository
public interface EmployeeDao {
    public int add(Employee employee);
    public List<Employee> getAll();
    public void  update(Employee employee);
    public Employee getById(long id);
    public void delete(long id);
}
