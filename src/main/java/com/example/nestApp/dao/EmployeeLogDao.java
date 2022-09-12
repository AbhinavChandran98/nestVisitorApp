package com.example.nestApp.dao;

import com.example.nestApp.model.EmployeeLogModel;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeLogDao extends CrudRepository<EmployeeLogModel,Integer> {
}
