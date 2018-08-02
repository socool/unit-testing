package com.bcorpse.unittesing.unittesting.com.bcorpse.unittesting.business;

public class SomeBusinessImpl {

    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }

    private SomeDataService someDataService;

    public int calculateSum(int[] data){
        int sum = 0;
        for (int value:data){
            sum += value;
        }
        return sum;
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
