package com.user.userservice.service;

import com.user.userservice.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    List<User> list=List.of(
            new User(1000L,"Dhruvil","1234567891"),
            new User(1001L,"Virat","2234567891"),
            new User(1002L,"Rohit","34234567891")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);

    }



}
