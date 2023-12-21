package com.edstem.task.controller;

import com.edstem.task.contract.request.BubbleSortRequest;
import com.edstem.task.contract.response.BubbleSortResponse;
import com.edstem.task.service.BubbleSortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BubbleSortController {
    @Autowired
    private BubbleSortService bubbleSortService;



    @PostMapping("/sort")
    public BubbleSortResponse sort(@RequestBody BubbleSortRequest request) {
        int[] sortedNumbers = bubbleSortService.sort(request.getNumbers());

        BubbleSortResponse response = new BubbleSortResponse();
        response.setSortedNumbers(sortedNumbers);

        return response;
    }

}
