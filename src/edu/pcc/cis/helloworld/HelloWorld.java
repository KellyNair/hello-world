package edu.pcc.cis.helloworld;

//author: Kelly Nair
// date: 2019.21.10

import java.util.Date;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Have a great day!");

        char c = 'A';

        do {
            System.out.println(c);
            c++;
        } while (c <= 'Z');

        System.out.println(new Date());
    }


}
