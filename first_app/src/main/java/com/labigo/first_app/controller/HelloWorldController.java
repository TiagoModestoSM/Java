/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.labigo.first_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.labigo.first_app.domain.User;
import com.labigo.first_app.service.HelloWorldService;

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

    @Autowired
    // Injeção de dependência do serviço
    private HelloWorldService helloWorldService;

    @GetMapping
    // Mapeia a requisição GET para o método helloWorld
    public String helloWorld() {
        return helloWorldService.helloWorld("Test");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id,@RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) {
        return "hello World!" + body.getName();
    }
}
