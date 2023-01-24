package com.example.springbootdto.service;

import com.example.springbootdto.dto.FriendLocation;
import com.example.springbootdto.model.MyFriend;
import com.example.springbootdto.repository.MyFriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FriendService {

    @Autowired
    private MyFriendRepository friendRepository;

    public List<FriendLocation> getAllFriendLocation(){
        return friendRepository.findAll()
                .stream()
                .map(this::convertModelTODTO)
                .collect(Collectors.toList());
    }

    private FriendLocation convertModelTODTO(MyFriend myFriend){
        FriendLocation friendLocation = new FriendLocation();
        friendLocation.setFriend_id(myFriend.getFriend_id());
        friendLocation.setName(myFriend.getName());
        friendLocation.setEmail(myFriend.getEmail());
        friendLocation.setAddress(myFriend.getLocation().getAddress());

        return friendLocation;
    }
}
