package com.example.codingtest.user;

import lombok.Data;

public class UserResponse {

    @Data // getter, setter, toString
    public static class UserDTO {
        private Integer id;
        private String name;

        public UserDTO(Integer id, String name) {
            this.id = id;
            this.name = name;
        }
    }

}
