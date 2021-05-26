package com.tcs.bfsi.rtes.ui.repository;

import com.tcs.bfsi.rtes.ui.model.ProcessError;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProcessErrorRepository extends MongoRepository<ProcessError, Long> {
}
