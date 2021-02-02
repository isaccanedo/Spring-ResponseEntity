package br.com.isaccanedo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Isac Canedo
 */

@RestController
public class ResponseEntityDemo {

    @GetMapping("/")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<String>("Hello Isac na raiz", HttpStatus.OK);
    }

    @GetMapping("/manual")
    void manual(HttpServletResponse response) throws IOException {
        response.setHeader("Custom-Header", "foo");
        response.setStatus(200);
        response.getWriter().println("Hello Isac! no EndPoint => manual");

    }

}
