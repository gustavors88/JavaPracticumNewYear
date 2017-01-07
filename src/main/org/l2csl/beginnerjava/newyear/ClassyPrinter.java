package org.l2csl.beginnerjava.newyear;

import sun.util.resources.cldr.ss.CalendarData_ss_SZ;

/**
 * Created by Gustavo on 1/7/2017.
 */
public class ClassyPrinter extends FancyPrinter {

    public ClassyPrinter(String text){
        super(text);
    }

    @Override
    public void print(){
        int stringLength = stringArr.length;

        for(int i=stringLength-1; i >= 0; i--){
            System.out.println(stringArr[i]);
        }
    }

    public void print(boolean isSuper) {

        if(isSuper){
            super.print();
        }
        else{
            print();
        }

    }
}
