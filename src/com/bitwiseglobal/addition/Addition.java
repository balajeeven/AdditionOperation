package com.bitwiseglobal.addition;

/**
 * Created by balajeev on 1/28/2016.
 */
public class Addition {


    public void add(int no1,int no2)
    {
        System.out.println(no1+no2);
    }
    public void add(int no1,int no2,int no3){
        System.out.println(no1+no2+no3);
    }

    public static void main(String args[])

    {

        Addition addition=new Addition();
        addition.add(10,30);
        addition.add(10,70,78);
    }
}
