package com.mazzocchi.audit.Audit.Collectionsend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CollectSendRepository {

    @Repository
    public interface User extends JpaRepository<User, Integer>{

    }

    @Repository
    public interface UserAudit extends JpaRepository<UserAudit, Integer>{

    }
}
