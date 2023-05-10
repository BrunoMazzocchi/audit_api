package com.mazzocchi.audit.Audit;

import jakarta.persistence.*;
import lombok.*;

import java.sql.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "user_audit")
public class UserAudit {
    /// UserAudit model class that receives data from the database
    @Id
    @Column(name = "id_user_audit")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_audit_seq")
    private int idUserAudit;

    @Column(name = "id_author")
    private int author;

    @Column(name = "id_affected_user")
    private int user;

    @Column(name = "username")
    private String username;

    @Column(name = "name")
    private String name;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "id_operation")
    private int operation;

    @Column(name = "date")
    private Date date;

}
