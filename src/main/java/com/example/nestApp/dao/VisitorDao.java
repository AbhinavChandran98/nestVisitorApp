package com.example.nestApp.dao;

import com.example.nestApp.model.VisitorModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface VisitorDao extends CrudRepository<VisitorModel,Integer> {

    //update query
    @Transactional
    @Modifying
    @Query(value = "UPDATE `employee` SET `emp_code`=?1,`mobile`=?2,`name`=?3,`password`=?4,`username`=?5,`designation`=?6 WHERE 'id'=?7",nativeQuery = true)
    void updateEmployee(int emp_code,int mobile,String name,String password,String username,String designation,int id);

    //search query
    @Query(value = "SELECT * FROM `employee` WHERE name=?1 || id=?2 || emp_code=?3 ||username=?4 || designation=?5 ||mobile=?6",nativeQuery = true)
    List<VisitorModel> search(String name,int id,int emp_code,String username,String designation,int mobile);


  //  login querry

    @Query(value = "Select * from employee where username=?1 AND password=?2",nativeQuery = true)
    List<VisitorModel> login(String username,String password);
}
