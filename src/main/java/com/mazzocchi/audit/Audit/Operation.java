package com.mazzocchi.audit.Audit;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.javapoet.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "operations")
public class Operation {
    /// This class is used to store the operations that are performed on the database, such as insert, update and delete operations on the User table and its fields

    @Id
    @Column(name = "id_operation")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "operation_seq")
    private int idOperation;

    @Enumerated(EnumType.STRING)
    @Column(length = 60)
    private OperationName operationName;
}
