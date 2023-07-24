
package com.mycompany.practical_02;


public class Practical_02 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Item item=new Item(20,"This is a sword");
        System.out.println("item.getLocation()");
        System.out.println("item.Description");
        
        Monster monster=new Monster (30,"This is a dragon");
        System.out.println("monster.getLocation()");
        System.out.println("monster.getDescription()");
    }
}
