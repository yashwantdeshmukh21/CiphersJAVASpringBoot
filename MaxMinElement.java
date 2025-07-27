//Find the maximum and minimum element in an array

import java.util.Scanner;

class MaxMinElement {
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50};
        int max = arr[0], min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum: "+ max);
        System.out.println("Minimum: "+ min);

    }
}