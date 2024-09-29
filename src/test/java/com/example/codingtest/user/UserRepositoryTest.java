package com.example.codingtest.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void FindAllUser_test(){
        List<User> users = userRepository.findAll();
        System.out.println(users);
    }

    @Test
    public void FindUserById_test(){
        int id = 4;
        User user = userRepository.findById(id).get();
        System.out.println(user);
    }

    @Test
    public void SaveUser_test(){
        String user = "ere";
        int id = 2;
        User userInfo = userRepository.findById(id).get();
        userInfo.setName(user);
        User userInfo2 = userRepository.findById(id).get();
        System.out.println(userInfo2);

    }

}
