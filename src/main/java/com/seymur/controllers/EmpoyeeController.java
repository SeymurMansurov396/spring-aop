package com.seymur.controllers;

import com.seymur.model.Employee;
import com.seymur.service.EmployeeDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Seymur on 6/2/2018.
 */
@RestController
@RequestMapping("/employee")
public class EmpoyeeController implements ErrorController {
    @Autowired
    private EmployeeDaoImpl employeeDao;


    @GetMapping
    public String fuck(){
        return "fuck";
    }
    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Employee employee){
        int i=employeeDao.add(employee);
        String message="created";
       /* ResponseEntity<String> responseEntity = new ResponseEntity<>("Saved successfully",
                HttpStatus.OK);
                */
       if(i>0){
           return   ResponseEntity.status(201).body("created successfully");
       }else{
           return ResponseEntity.status(300).body("Failed to save");
       }


    }


    private   static  final String errorPath="/error";
    @Override
    public String getErrorPath() {
        return errorPath;
    }

    @GetMapping(errorPath)
    public String errorPage(){
        return "NOt found";
    }
}
