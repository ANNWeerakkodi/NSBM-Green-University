
package com.mycompany.practical_05_q01;


public class InterfaceImplemented implements MyFirstInterface{
    @Override
    public void display() 
    {
        x = 20; // Error: Cannot assign a value to a final variable x
        System.out.println(x);
    }
}
