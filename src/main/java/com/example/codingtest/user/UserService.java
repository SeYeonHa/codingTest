package com.example.codingtest.user;

import com.example.codingtest.core.error.ex.ExceptionApi404;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public List<User> FindAll() {
        return userRepository.findAll();
    }

    public User FindById(Integer id) {
        User userInfo = userRepository.findById(id).orElseThrow(() -> new ExceptionApi404("유저를 찾을 수 없습니다"));
        return userInfo;
    }

    @Transactional
    public void updateUserInfo(Integer id, String user) {
        User userInfo = userRepository.findById(id).orElseThrow(() -> new ExceptionApi404("유저를 찾을 수 없습니다"));
        userInfo.setName(user);
    }
}
