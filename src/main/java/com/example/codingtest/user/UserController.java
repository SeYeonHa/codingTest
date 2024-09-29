package com.example.codingtest.user;

import com.example.codingtest.util.Resp;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping("/")
    public ResponseEntity<?> home(){
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/users")
    public ResponseEntity<?> addUser(){
        List<User> userList = userService.FindAll();
        return ResponseEntity.ok(Resp.ok(userList));
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id){
        User userInfo = userService.FindById(id);
        return ResponseEntity.ok(Resp.ok(userInfo));
    }

    @GetMapping("/users/{id}/update/{name}")
    public ResponseEntity<?> updateUser(@PathVariable Integer id, @RequestBody String user){
        userService.updateUserInfo(id,user);
        return ResponseEntity.ok(Resp.ok("수정완료"));
    }

}
