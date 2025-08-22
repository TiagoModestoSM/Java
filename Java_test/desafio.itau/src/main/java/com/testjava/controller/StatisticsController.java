/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.testjava.controller;

import java.util.DoubleSummaryStatistics;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testjava.dto.StatisticsResponse;
import com.testjava.service.TransactionService;

/**
 *
 * @author labig
 */
@RestController
@RequestMapping("/estatistica")
public class StatisticsController {
    private final TransactionService transactionService;
    public StatisticsController(TransactionService transactionService){
        this.transactionService = transactionService;    
    }

    @GetMapping
    public ResponseEntity<StatisticsResponse> getStatistics() {
        DoubleSummaryStatistics stats = transactionService.getStatistics();
        return ResponseEntity.ok(new StatisticsResponse(stats));

    }
}
