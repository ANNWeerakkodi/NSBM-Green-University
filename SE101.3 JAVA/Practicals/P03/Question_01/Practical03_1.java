
package com.mycompany.practical03_1;


public class Practical03_1 {

    public static void main(String[] args) {
        Employee emp=new Employee();
        
        emp.setName("Bogdan");
        emp.setAge(30);
        emp.setSalary(50000);
        
        System.out.println("Employye Name:"+emp.getName());
        System.out.println("Employee Age:"+emp.getAge());
        System.out.println("Employee salary:"+emp.getSalary());
    }
}
