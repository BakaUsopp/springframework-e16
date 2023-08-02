package com.example.springframeworke16.actuater.endpoints;


import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "myendpoint")
public class MyCustomerEndpoint {


    @ReadOperation
    public String test(){
        return ":)";
    }



}
