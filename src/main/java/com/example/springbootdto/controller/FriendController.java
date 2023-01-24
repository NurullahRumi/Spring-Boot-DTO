package com.example.springbootdto.controller;

import com.example.springbootdto.dto.FriendLocation;
import com.example.springbootdto.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FriendController {

    @Autowired
    private FriendService friendService;

    @GetMapping("/friend-location")
    public List<FriendLocation> getAllFriendsLocation(){
        return friendService.getAllFriendLocation();
    }
}
