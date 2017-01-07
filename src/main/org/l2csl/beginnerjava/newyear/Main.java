package org.l2csl.beginnerjava.newyear;



class JavaPracticumNewYear {

    public static int add(int a, int b) {
        return a+b;
    }

    public static void explote(String text){

        for(int i=0; i < text.length();i++){
            System.out.println(text.charAt(i));
        }
    }

    public static void main(String[] args) {

        int sum;

        sum = add(3, 5);

        System.out.println("hello");

        explote("Boom");

        FancyPrinter fancyPrinter = new FancyPrinter("I can code");

        fancyPrinter.print();

        ClassyPrinter classyPrinter = new ClassyPrinter("I'm a pro");

        classyPrinter.print();

        classyPrinter.print(true);


    }
}
