package com.example.springbootdto.dto;

import lombok.Data;

@Data
public class FriendLocation {
    private Long friend_id;
    private String name;
    private String email;
    private String address;
}
