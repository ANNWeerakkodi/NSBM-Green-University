
package com.mycompany.practical_01;


 
public class Practical_01 {

    public static void main(String[] args) {
       //Q 01
       System.out.println("Hello World!");
        
        //Q 02
        System.out.println("My name is Adithya");
        System.out.println("I'm a software Engineer");
        
        //Q 03(using For Loop)
        for(int i=0;i<5;i++)
        {
            System.out.println("Executing Loop  "+i);
        }
        
        // Q 03(Using While Loop)
        int i=0;
        while(i<5)
        {
            System.out.println("Executing Loop "+i);
            i++;
        
        }
        
        // Q 04
        int []numbers={10,20,30,40,50};
        for(int x:numbers)
        {
         if(x==30)
         {
          break;
         }
            System.out.println(x);
            System.out.println("\n");
            
        
        }
        System.out.println("I'm out of the Loop now");
        /* RESULT:
        10
        20
        I'm out of the Loop now
        */
        
      int[]numbers={10,20,30,40,50};
        for(int x:numbers)
        {
         if(x==30)
         {
         continue;
         
         }
            System.out.println(x);
            System.out.println("\n");
        }
        System.out.println("I'm out of the Loop now");
        /*RESULT;
        10
        20
        40
        50
        I'm out of the Loop now
        */
        
        // Q 05
        
        
     char grade='A';
        switch(grade)
        {
            case 'A':
                System.out.println("Excellent!");
                break;
                
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
                
        }
        System.out.println("Your grade is "+grade);
        
        /*OUTPUT is
        Excellent!
        Your frade is A
        */
        char grade='A';
        switch(grade)
        {
            case 'A':
                System.out.println("Excellent!");
                
                
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
                
        }
        System.out.println("Your grade is "+grade);
        
       /*
        Excellent!
        You passed
        Better try again
        Your grade is A
        */
       
       // Using IF ELSE
       
        char grade='A';
        if (grade =='A')
        {
            System.out.println("Excellent!"); 
        
        }
        else if(grade=='D')
        {
            System.out.println("You passed");
        }
        else if (grade=='F')
        {
            System.out.println("Better try again");
        }
        else
        {
            
            System.out.println("Invalid grade");
        }
        System.out.println("Your grade is "+grade);
        
        // Q 06
        
        int []numbers={10,20,30,40,50};
         for (int x: numbers)
         {
         
             System.out.print(x);
             System.out.print(",");
         }
         System.out.print("\n");
         String[] names={"James","Larry","Tom","Lacy"};
         for(String name:names)
         {
             System.out.print(name);
             System.out.print(",");
         }
         
         /*OUTPUT
         10,20,30,40,50,
         James,Larry,Tom,Lacy
         */
        
        
    }
}
