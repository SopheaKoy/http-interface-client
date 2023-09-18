package dev.sophea.httpinterfacewebclient.server;

import dev.sophea.httpinterfacewebclient.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface UserClientServer {

    @GetExchange("/users")
    Flux<User> getAllUsers();

    @GetExchange("/users/{uuid}")
    Mono<User> getUserByUuid(String uuid);

    @PostExchange("/users")
    Mono<User> createUser(User user);

    @DeleteExchange("/users/{uuid}")
    Mono<User> deleteUserByUuid(String uuid);


}
