package com.coding;

public class SampleTest {
    public static int countPrimes(int n) {
        if(n<=2)
            return 0;
        boolean[] nonPrimes=new boolean[n];
//         1 wil not be counted in prime so count =1
        int nonPrime=1;
        // nonPrimes[1]=true;

        for(int i=2;i<n;i++){

            if(nonPrimes[i])
                continue;
            else{
                int mutiple=i*2;
                while(mutiple<n){
                    if(!nonPrimes[mutiple]){
                        nonPrimes[mutiple]=true;
                        nonPrime++;
                    }

                    mutiple=mutiple+i;

                }
            }

        }

        return (n-1)-nonPrime;
    }


    public static void main(String[] args){
        System.out.println(countPrimes(10));
    }
}
