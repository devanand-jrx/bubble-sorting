package com.edstem.task.service;

import com.edstem.task.contract.response.BubbleSortResponse;
import org.springframework.stereotype.Service;


@Service
public class BubbleSortService {


    public BubbleSortResponse sort(int[] numbers) {
        long startTime = System.nanoTime();

        int n = numbers.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (numbers[i - 1] > numbers[i]) {
                    int temp = numbers[i - 1];
                    numbers[i - 1] = numbers[i];
                    numbers[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        long endTime = System.nanoTime();
        long estimatedTime = endTime - startTime;




        return new BubbleSortResponse(numbers, estimatedTime);



    }

}
