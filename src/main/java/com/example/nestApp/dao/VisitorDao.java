package com.example.nestApp.dao;

import com.example.nestApp.model.VisitorModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface VisitorDao extends CrudRepository<VisitorModel,Integer> {

    @Transactional
    @Modifying
    @Query(value = "UPDATE `employee` SET `emp_code`=?1,`mobile`=?2,`name`=?3,`password`=?4,`username`=?5,`designation`=?6 WHERE 'id'=?7",nativeQuery = true)
    void updateEmployee(int emp_code,int mobile,String name,String password,String username,String designation,int id);
}
