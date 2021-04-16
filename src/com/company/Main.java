package com.company;

public class Main {

    public static int mulitpliesOf3And5(int gesamt){
        int sum = 0;
       for(int i=0; gesamt > i; i++){
           if(i% 3 ==0 || i%5==0){
                sum += i;
           }
       }return sum;
    }
}
