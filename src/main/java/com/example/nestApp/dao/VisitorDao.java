package com.example.nestApp.dao;

import com.example.nestApp.model.VisitorModel;
import org.springframework.data.repository.CrudRepository;

public interface VisitorDao extends CrudRepository<VisitorModel,Integer> {

}
