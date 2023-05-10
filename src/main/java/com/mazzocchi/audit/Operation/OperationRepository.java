package com.mazzocchi.audit.Operation;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface OperationRepository extends JpaRepository<Operation, Integer> {

    Operation findByIdOperation(int idOperation);

    List<Operation> findAll();
}
