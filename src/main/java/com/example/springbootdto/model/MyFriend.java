package com.example.springbootdto.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "my_friend")
public class MyFriend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long friend_id;
    private String name;
    private String email;
    private String phNo;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "locId")
    private Location location;
}
