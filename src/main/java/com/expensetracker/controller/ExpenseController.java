package com.expensetracker.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ahareesh
 *
 * Sample Contoller for expenses
 */
@RestController
@RequestMapping("/expenses")
@Slf4j
public class ExpenseController {

    /**
     *  Check service status
     * @return status
     */
    @RequestMapping(method = RequestMethod.GET,value = "/ping")
    public ResponseEntity<String> ping() {
        log.info("ping service ");
        return ResponseEntity.status(HttpStatus.OK).body("I'm Up to serve your request");
    }
}
