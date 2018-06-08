package com.seymur.service;

import com.seymur.dao.EmployeeDao;
import com.seymur.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Seymur on 6/1/2018.
 */

@Service
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int add(Employee employee) {
       int i=jdbcTemplate.update("INSERT  into employees(NAME ,SALARY) VALUES (?,?)",employee.getName(),employee.getSalary());
        System.out.println("Adding Employee : "+i);
        return  i;
    }

    @Override
    public List<Employee> getAll() {
        System.out.println("getting all Employee");
        return null;
    }

    @Override
    public void update(Employee employee) {
        System.out.println("updating Employee");
    }

    @Override
    public Employee getById(long id) {
        System.out.println("get  Employee by id");
        return null;
    }

    @Override
    public void delete(long id) {
        System.out.println("deleting Employee");
    }


}
