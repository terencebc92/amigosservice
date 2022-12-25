package com.amigoscode.fraud.controller;

import com.amigoscode.fraud.dto.FraudCheckHistoryDto;
import com.amigoscode.fraud.service.FraudCheckHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
public class FraudCheckHistoryController {

    @Autowired
    private FraudCheckHistoryService fraudCheckHistoryService;

    @GetMapping(path = "{customerId}")
    public FraudCheckHistoryDto isFraudster(@PathVariable("customerId") Integer customerId) {
        boolean isFraudulentCustomer = fraudCheckHistoryService.isFraudulentCustomer(customerId);
        return new FraudCheckHistoryDto(isFraudulentCustomer);
    }
}
