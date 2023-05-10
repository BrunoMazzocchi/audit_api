package com.mazzocchi.audit.Operation;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/v1/operation")
public class OperationController {
    @Autowired
    private OperationService operationService;

    @GetMapping("/read/{idOperation}")
    public ResponseEntity<Operation> readOperation(@PathVariable int idOperation) {
        Operation operation = operationService.getOperationById(idOperation);
        return new ResponseEntity<>(operation, HttpStatus.OK);
    }

    @GetMapping("/read/all")
    public ResponseEntity<List<Operation>> getAll(){
        return new ResponseEntity<>(operationService.getAllOperations(), HttpStatus.OK);
    }
}
