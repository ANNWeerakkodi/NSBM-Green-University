
package com.mycompany.practical03_2;


public class Employee {
    private String name;
    private double basicSalary;
    private double bonus;
    
    //constructor
    public Employee(String name ,double basicSalary,double bonus)
    {
        this.name=name;
        this.basicSalary =basicSalary;
        this.bonus=bonus;
    
    }
    //getter
    public String getName()
    {
     return name;
    }
    
    public double getBasicSalary()
    {
      return basicSalary;
    }
    public double getBonus()
    {
      return bonus;
    }
    //Bonus Amount calculatiion
    
    public double calculateBonusAmount()
    {
      return basicSalary+bonus;
    }
    
}
