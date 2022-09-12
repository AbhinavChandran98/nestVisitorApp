package com.example.nestApp.dao;

import com.example.nestApp.model.VisitorLogModel;
import org.springframework.data.repository.CrudRepository;

public interface VisitorLogDao extends CrudRepository<VisitorLogModel,Integer> {
}
