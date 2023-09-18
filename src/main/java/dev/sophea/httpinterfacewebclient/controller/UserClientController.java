package dev.sophea.httpinterfacewebclient.controller;

import dev.sophea.httpinterfacewebclient.model.User;
import dev.sophea.httpinterfacewebclient.server.UserClientServer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserClientController {

    private final UserClientServer userClientServer;

    @GetMapping("/users")
    public Flux<User> getAllUsers(){

        return userClientServer.getAllUsers();
    }

    @GetMapping("/users/{uuid}")
    public Mono<User> getUserByUuid(@PathVariable String uuid){

        return userClientServer.getUserByUuid(uuid);
    }

    @PostMapping("/users")
    public Mono<User> createUser(@RequestBody User user){

        return userClientServer.createUser(user);
    }

    @DeleteMapping("/users/{uuid}")
    public Mono<User> deleteUserByUuid(@PathVariable String uuid){

        return userClientServer.deleteUserByUuid(uuid);
    }

}
