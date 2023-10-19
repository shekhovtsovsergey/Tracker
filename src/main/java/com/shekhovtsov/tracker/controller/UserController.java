package com.shekhovtsov.tracker.controller;

import com.shekhovtsov.tracker.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@CrossOrigin
public class UserController {

    public final static User FALLBACK_USER = new User("unknown", "Unknown user (Internal Error)", "unknown.user@mail.com", null);

    @GetMapping("/users")
    public List<User> getAll(Authentication auth) {
        return List.of(FALLBACK_USER);
    }

}
