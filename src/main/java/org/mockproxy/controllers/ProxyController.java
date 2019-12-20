package org.mockproxy.controllers;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequestMapping("/proxy")
public class ProxyController {

    @GetMapping(path = "/**")
    public Object get(@RequestBody String requestBody, @RequestHeader Map<String, String> requestHeader,
                      HttpServletRequest httpRequest) {

        
    }

}
