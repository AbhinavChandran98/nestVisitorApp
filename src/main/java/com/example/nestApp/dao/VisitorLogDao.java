package com.example.nestApp.dao;

import com.example.nestApp.model.VisitorLogModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.Date;

public interface VisitorLogDao extends CrudRepository<VisitorLogModel,Integer> {

    @Transactional
    @Modifying
    @Query(value = "UPDATE `visitorlog` SET `logout_time`=?1 WHERE `name`=?2",nativeQuery = true)
    void visitorSignOut(Date logout,String name);
}
