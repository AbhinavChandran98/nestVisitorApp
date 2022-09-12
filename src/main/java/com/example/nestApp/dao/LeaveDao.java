package com.example.nestApp.dao;

import com.example.nestApp.model.LeaveModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface LeaveDao extends CrudRepository<LeaveModel,Integer> {

   @Transactional
    @Modifying
    @Query(value = "UPDATE `leavetable` SET `status`=?1  WHERE `emp_id`=?2",nativeQuery = true)
    void updateRequest(int status,int emp_id);
}
