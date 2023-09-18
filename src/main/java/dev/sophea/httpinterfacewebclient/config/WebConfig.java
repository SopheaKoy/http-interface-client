package dev.sophea.httpinterfacewebclient.config;

import dev.sophea.httpinterfacewebclient.server.EmployeeClientServer;
import dev.sophea.httpinterfacewebclient.server.UserClientServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class WebConfig {

    // User Server
    private final String BASE_URL="http://localhost:8081/api/v1";

    // Authorization Server
    private final String BASE_URL_AUTH="http://localhost:8082/api/v1";

    private final String BASE_URL_JWT="http://localhost:8083/api/v1";

    @Bean
    public UserClientServer userClientServer(){

        WebClient webClient = WebClient.builder()
                .baseUrl(BASE_URL)
                .build();

        HttpServiceProxyFactory factory = HttpServiceProxyFactory
                .builder(WebClientAdapter
                        .forClient(webClient))
                .build();

        return factory.createClient(UserClientServer.class);
    }
    @Bean
    public EmployeeClientServer employeeClientServer(){

        WebClient webClient = WebClient.builder()
                .baseUrl(BASE_URL)
                .build();

        HttpServiceProxyFactory factory = HttpServiceProxyFactory
                .builder(WebClientAdapter
                        .forClient(webClient))
                .build();

        return factory.createClient(EmployeeClientServer.class);
    }

    @Bean
    public WebClient webClientAuth(){

        return WebClient.builder()
                .baseUrl(BASE_URL_AUTH)
                .defaultHeader("Authorization" , "Bearer ")
                .build();
    }

    @Bean
    public WebClient webClientJwt(){

        return WebClient.builder()
                .baseUrl(BASE_URL_JWT)
                .build();

    }

}
