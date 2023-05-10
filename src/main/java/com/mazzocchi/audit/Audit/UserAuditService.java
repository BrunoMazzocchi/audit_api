package com.mazzocchi.audit.Audit;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class UserAuditService {
    @Autowired
    private UserAuditRepository userAuditRepository;

    public UserAudit save(UserAudit userAudit) {
        return userAuditRepository.save(userAudit);
    }

    public UserAudit update(UserAudit userAudit) {
        return userAuditRepository.save(userAudit);
    }

    public UserAudit getUserAuditById(int idUserAudit) {
        return userAuditRepository.findByIdUserAudit(idUserAudit);
    }

    public List<UserAudit> getAllUserAudits() {
        return userAuditRepository.findAll();
    }

}
