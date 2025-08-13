/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.labigo.first_app.service;

import org.springframework.stereotype.Service;

/** 
 *
 * @author labig
 */
@Service
// Classe de serviço que contém a lógica de negócios
public class HelloWorldService {

    public String helloWorld(String name) {
        return "Hello World " + name;
    }


}
