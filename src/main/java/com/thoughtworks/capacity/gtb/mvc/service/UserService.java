package com.thoughtworks.capacity.gtb.mvc.service;

import com.thoughtworks.capacity.gtb.mvc.dto.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class UserService {

    private Map<Integer, User> userMap = new HashMap<>();

    public UserService() {
        userMap.put(1, new User(1, "Eva", "123456Eva", "evacheng@hotmail.com"));
        userMap.put(2, new User(2, "Roy", "123456Roy", "royjiang@hotmail.com"));
    }

    public List<User> getAllUsers() { return new ArrayList<>(userMap.values()); }

    public void createUser(User user) { userMap.put(user.getId(), user); }

    public List<User> getUserByUsername(String username, String password) {
        return userMap.values().stream()
                .filter(user -> user.getUsername().equals(username))
                .filter(user -> user.getPassword().equals(password))
                .collect(Collectors.toList());
    }
}
