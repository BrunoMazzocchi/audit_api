package com.mazzocchi.audit.Audit.Collectionsend;

import com.mazzocchi.audit.User.User;
import com.mazzocchi.audit.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class CollectSendController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User insert(@RequestBody User user){
        return userService.save(user);
    }
    @PutMapping("/{id}")
    public User update(@PathVariable int id, @RequestBody User user){
        return userService.update(id, user);
    }
}
