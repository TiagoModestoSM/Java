/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.labigo.first_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author labig
 */
@RestController
//STATELESS -> o estado do cliente não é mantido entre as requisições (servidor não guarda informações sobre o cliente) RESTcontroller
// -> é uma especialização do controlador que indica que os métodos retornam dados diretamente (JSON, XML, etc.)
// -> é usado para criar APIs RESTful
//STATEFULL -> o estado do cliente é mantido entre as requisições (servidor guarda informações sobre o cliente)
// -> é usado para criar aplicações web tradicionais
@RequestMapping("/hello-world")
// -> mapeia a URL "/hello-world" para este controlador
public class HelloWorldController {
// responde a requisições HTTP GET ou POST ou PUT ou DELETE

    @GetMapping
    public String helloWorld() {
        return "Tralalelo Tralala";
    }

}
