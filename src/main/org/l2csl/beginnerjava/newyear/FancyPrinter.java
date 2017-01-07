package org.l2csl.beginnerjava.newyear;

/**
 * Created by Gustavo on 1/7/2017.
 */
public class FancyPrinter {

    protected String[] stringArr;

    FancyPrinter(String toSplit){
        stringArr = toSplit.split(" ");
    }

    public void print(){

        for(int i=0; i < stringArr.length; i++){
            System.out.println(stringArr[i]);
        }
    }


}
