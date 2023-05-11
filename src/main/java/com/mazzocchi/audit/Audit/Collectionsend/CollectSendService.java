package com.mazzocchi.audit.Audit.Collectionsend;

import com.mazzocchi.audit.Audit.UserAudit;
import com.mazzocchi.audit.Audit.UserAuditRepository;
import com.mazzocchi.audit.User.User;
import com.mazzocchi.audit.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import static org.apache.tomcat.util.http.FastHttpDateFormat.getCurrentDate;

public class CollectSendService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserAuditRepository userAuditRepository;


    public void copyData(){
        List<User> users = userRepository.findAll();
        List<UserAudit> userAudits = new ArrayList<>();

        for(User user : users){
            UserAudit userAudit = new UserAudit();
            userAudit.setAuthor(user.getIdUser());
            userAudit.setUser(user.getIdUser());
            userAudit.setUsername(user.getUsername());
            userAudit.setName(user.getName());
            userAudit.setLastName(user.getLastName());
            userAudit.setPassword(user.getPassword());
            userAudit.setEmail(user.getEmail());
            userAudit.setDate(Date.valueOf(getCurrentDate()));

        }
        userAuditRepository.saveAll(userAudits);
    }
}
