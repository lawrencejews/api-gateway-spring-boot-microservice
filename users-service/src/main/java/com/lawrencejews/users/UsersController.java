package com.lawrencejews.users;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UsersController {

    private final UsersService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(
            @RequestBody Users user
    ) {
        service.saveUsers(user);
    }

    @GetMapping
    public ResponseEntity<List<Users>> findAllUsers() {
        return ResponseEntity.ok(service.findAllUsers());
    }

    @GetMapping("/with-rewards/{user-id}")
    public ResponseEntity<FullUsersResponse> findAllUsers(
            @PathVariable("user-id") Integer userId
    ) {
        return ResponseEntity.ok(service.findUsersWithRewards(userId));
    }
}
