package com.ferhad.consumingrestapi;

import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FakeUserConsumer {
    private final RestTemplate restTemplate = new RestTemplate();
    public static final String RESOURCE = "https://jsonplaceholder.typicode.com/users";

    public List<User> getAll() {
        User[] users = restTemplate.getForObject(RESOURCE, User[].class);
        if (users != null)
            return Arrays.stream(users)
                    .collect(Collectors.toUnmodifiableList());
        return new ArrayList<>();
    }
}
