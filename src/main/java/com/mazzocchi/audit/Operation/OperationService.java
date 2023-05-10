package com.mazzocchi.audit.Operation;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class OperationService {
    @Autowired
    private OperationRepository operationRepository;

    public Operation getOperationById(int idOperation) {
        return operationRepository.findByIdOperation(idOperation);
    }

    public List<Operation> getAllOperations() {
        return operationRepository.findAll();
    }

}
