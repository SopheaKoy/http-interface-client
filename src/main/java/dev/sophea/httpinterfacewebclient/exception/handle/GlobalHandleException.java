package dev.sophea.httpinterfacewebclient.exception.handle;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.reactive.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;

import java.util.HashMap;
import java.util.Map;

@Component
public class GlobalHandleException extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(ServerRequest request, ErrorAttributeOptions options) {

        Map<String , Object> errorMap =  new HashMap<>();

        Throwable error = getError(request);

        errorMap.put("message" , error.getMessage());

        errorMap.put("end-point url" , request.path());

        return errorMap;
    }
}
