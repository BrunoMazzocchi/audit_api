package com.mazzocchi.audit.User;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import com.mazzocchi.audit.Audit.*;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    private int idUserAudit;
    private UserAudit userAudit;

    public User save(User user) {
        return userRepository.save(user);
    }

    public User findByIdUser(int idUser) {
        return userRepository.findById(idUser).orElse(null);
    }

    public void deleteByIdUser(int idUser) {
        userRepository.deleteById(idUser);
    }

    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username).orElse(null);
    }

    public User update(int idUserAudit, User user) {
        return user;
    }
}
