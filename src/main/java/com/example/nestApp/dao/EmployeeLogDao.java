package com.example.nestApp.dao;

import com.example.nestApp.model.EmployeeLogModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.Date;

public interface EmployeeLogDao extends CrudRepository<EmployeeLogModel,Integer> {


    @Transactional
    @Modifying
    @Query(value = "UPDATE `employeelog` SET `employee_logout`=?1 WHERE `emp_id`=?2",nativeQuery = true)
    void employeesignout(Date employeelogout, int emp_id);

}
