package com.mazzocchi.audit.Audit;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface UserAuditRepository extends JpaRepository<UserAudit, Integer> {

        UserAudit save(UserAudit userAudit);



        List<UserAudit> findAll();
        UserAudit findByIdUserAudit(int idUserAudit);
        List<UserAudit> findByUser(int idUser);


}
