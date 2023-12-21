package com.edstem.task.contract.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BubbleSortResponse {

    private int[] sortedNumbers;
    private long estimatedTime;

}
