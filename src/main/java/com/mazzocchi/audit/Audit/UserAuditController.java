package com.mazzocchi.audit.Audit;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user-audit")
public class UserAuditController {

    @Autowired
    private UserAuditService userAuditService;

    @PostMapping("/create")
    public ResponseEntity<UserAudit> create(@RequestBody UserAudit userAudit) {
        UserAudit newUserAudit = userAuditService.save(userAudit);
        return new ResponseEntity<>(newUserAudit, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<UserAudit> update(@RequestBody UserAudit userAudit) {
        UserAudit updateUserAudit = userAuditService.update(userAudit);
        return new ResponseEntity<>(updateUserAudit, HttpStatus.OK);
    }

    @GetMapping("/read/{idUserAudit}")
    public ResponseEntity<UserAudit> readUserAudit(@PathVariable int idUserAudit) {
        UserAudit userAudit = userAuditService.getUserAuditById(idUserAudit);
        return new ResponseEntity<>(userAudit, HttpStatus.OK);
    }

    @GetMapping("/read/all")
    public ResponseEntity<Iterable<UserAudit>> readAllUserAudits() {
        Iterable<UserAudit> userAudits = userAuditService.getAllUserAudits();
        return new ResponseEntity<>(userAudits, HttpStatus.OK);
    }

}
