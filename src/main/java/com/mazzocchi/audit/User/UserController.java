package com.mazzocchi.audit.User;


import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/read/{idUser}")
    public User readUser(@PathVariable int idUser) {
        return userService.findByIdUser(idUser);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping("/delete/{idUser}")
    public void deleteUser(@PathVariable int idUser) {
        userService.deleteByIdUser(idUser);
    }

    @GetMapping("/read/all")
    public Iterable<User> readAllUsers() {
        return userService.findAll();
    }
}
