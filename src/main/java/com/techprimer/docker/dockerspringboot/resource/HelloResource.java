package com.techprimer.docker.dockerspringboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nathan on 2017/12/29.
 */

@RestController
@RequestMapping("rest/docker/hello")
public class HelloResource {

    @GetMapping
    public String hello(){
        return "hello youtube";
    }
}
