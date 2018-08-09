package com.bcorpse.unittesing.business;

import java.util.Arrays;

public class SomeBusinessImpl {

    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }

    private SomeDataService someDataService;

    public int calculateSum(int[] data){
        //1,2,3,4,5 => 1+2+3+4+5
        return Arrays.stream(data).reduce(Integer::sum).orElse(0);

    }

    public int calculateSumUsingDataService(){
        int[] data = someDataService.retrieveAllData();
        int sum = 0;
        for (int value:data){
            sum += value;
        }
        //someDataService.storeSum(sum);
        return sum;
    }
}
