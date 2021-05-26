package com.tcs.bfsi.rtes.ui.controller;

import com.tcs.bfsi.rtes.ui.model.ProcessError;
import com.tcs.bfsi.rtes.ui.service.ProcessErrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rtes/api")
public class ProcessErrorController {
    @Autowired
    ProcessErrorService processErrorService;

    @PostMapping("/addError")
    public ResponseEntity addProcessError(@RequestBody ProcessError error) {
        this.processErrorService.addProcessError(error);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/getError/{id}")
    public ResponseEntity<ProcessError> getProcessError(@PathVariable("id") long id) {
        return ResponseEntity.ok(this.processErrorService.getProcessError(id));
    }
}
