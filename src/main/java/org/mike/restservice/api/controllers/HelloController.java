package org.mike.restservice.api.controllers;

import org.mike.restservice.api.models.Request;
import org.mike.restservice.api.models.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by levitsky on 14.06.18
 */
@RestController
@RequestMapping(HelloController.BASE_URL)
public class HelloController {

    public static final String BASE_URL = "/api/lm";

    @PostMapping({"/do_some_stuff"})
    @ResponseStatus(HttpStatus.OK)
    public Response hello(@RequestBody Request request){
        Response resp = new Response();
        resp.body = "Hello, " + request.name + " with property " + request.property;
        return resp;
    }
}
