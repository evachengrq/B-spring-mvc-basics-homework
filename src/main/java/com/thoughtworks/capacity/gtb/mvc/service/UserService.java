package com.thoughtworks.capacity.gtb.mvc.service;

import com.thoughtworks.capacity.gtb.mvc.dto.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    private Map<Integer, User> userMap = new HashMap<>();

    public UserService() {
        userMap.put(1, new User(1, "Eva", "123456Eva", "evacheng@hotmail.com"));
        userMap.put(2, new User(2, "Roy", "123456Roy", "royjiang@hotmail.com"));
    }

    public List<User> getAllUsers() { return new ArrayList<>(userMap.values()); }

}
