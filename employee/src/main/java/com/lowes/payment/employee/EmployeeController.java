package com.lowes.payment.employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EmployeeController {

    private final static Logger LOG = LoggerFactory.getLogger(Employee.class);


    @RequestMapping("/hello")
    public String getHello(){
        return "Hello World";
    }

    @RequestMapping(value = "/employee",method = RequestMethod.POST)
    public String saveEmployee(@RequestBody @Valid Employee e){
        LOG.info("Employee " + e.name +" saved with " +e.id);
        return "Employee with ID " +e.id + " has been saved";
    }


}
