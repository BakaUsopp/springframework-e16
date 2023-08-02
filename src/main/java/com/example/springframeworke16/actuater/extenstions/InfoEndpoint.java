package com.example.springframeworke16.actuater.extenstions;

import org.springframework.boot.actuate.endpoint.web.WebEndpointResponse;
import org.springframework.boot.actuate.endpoint.web.annotation.EndpointWebExtension;
import org.springframework.stereotype.Component;

@Component
@EndpointWebExtension(endpoint = InfoEndpoint.class)
public class InfoEndpoint {

    public WebEndpointResponse<String> info(){
        String responseMessage = "This is a custom info endpoint extension.";
        return new WebEndpointResponse<>(responseMessage, 200);
    }

}
