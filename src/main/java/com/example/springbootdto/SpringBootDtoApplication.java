package com.example.springbootdto;

import com.example.springbootdto.model.Location;
import com.example.springbootdto.model.MyFriend;
import com.example.springbootdto.repository.LocationRepository;
import com.example.springbootdto.repository.MyFriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDtoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDtoApplication.class, args);
    }

    @Autowired
    private MyFriendRepository friendRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public void run(String... args) throws Exception {
        Location location = new Location();
        location.setAddress("Kendua,Netrokona");
        location.setDescription("Some town in Netrokona district");
        locationRepository.save(location);

        MyFriend myFriend1 = new MyFriend();
        myFriend1.setName("Ananta");
        myFriend1.setEmail("ananta@gmail.com");
        myFriend1.setPhNo("1234567890");
        myFriend1.setLocation(location);

        friendRepository.save(myFriend1);

        MyFriend myFriend2 = new MyFriend();
        myFriend2.setName("Jaki");
        myFriend2.setEmail("Jaki@gmail.com");
        myFriend2.setPhNo("3456234534");
        myFriend2.setLocation(location);

        friendRepository.save(myFriend2);
    }
}
