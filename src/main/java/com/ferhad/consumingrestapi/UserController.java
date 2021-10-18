package com.ferhad.consumingrestapi;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    private final FakeUserConsumer fakeUserConsumer;

    public UserController(FakeUserConsumer fakeUserConsumer) {
        this.fakeUserConsumer = fakeUserConsumer;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity
                .ok(
                        fakeUserConsumer.getAll()
                );
    }
}
