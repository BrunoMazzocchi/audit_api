package com.mazzocchi.audit.User;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

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


}
