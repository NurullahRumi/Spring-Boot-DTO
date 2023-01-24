package com.example.springbootdto.repository;

import com.example.springbootdto.model.MyFriend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyFriendRepository extends JpaRepository<MyFriend, Long> {
}
