package com.tcs.bfsi.rtes.ui.service;

import com.tcs.bfsi.rtes.ui.model.ProcessError;
import com.tcs.bfsi.rtes.ui.repository.ProcessErrorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProcessErrorService {
    @Autowired
    ProcessErrorRepository processErrorRepository;

    public void addProcessError(ProcessError error) {
        this.processErrorRepository.insert(error);
    }

    public ProcessError getProcessError(long id) {
        Optional<ProcessError> processErrorOptional = this.processErrorRepository.findById(id);
        return (processErrorOptional.isEmpty()) ? null : processErrorOptional.get();
    }
}
