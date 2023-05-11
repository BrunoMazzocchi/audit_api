package com.mazzocchi.audit.Audit;

import com.mazzocchi.audit.User.User;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface UserAuditRepository extends JpaRepository<UserAudit, Integer> {



        UserAudit save();

        List<UserAudit> findAll();
        UserAudit findByIdUserAudit(int idUserAudit);
        List<UserAudit> findByUser(int idUser);


}
