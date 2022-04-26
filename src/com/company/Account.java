/**
 *

package com.company;

public class Account {
    private String sureName1;
    private String surename1;
    private String name2;
    private String surename2;

    public void setName1() {
    }

    public void setName1(String James) 
    {
        String Strong;
    }

    public void setSurename1(String surename1) {
        this.sureName1 = surename1;
    }

    public String getSurename1() {
        return sureName1;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName2() {
        return name2;
    }

    public void setSurename2(String surename2) {
        this.surename2 = surename2;
    }

    public String getSurename2() {
        return surename2;
    }
}

package com.company;
import java.util.Scanner;
public class Account {

    public static void main(String[] args) {
        String EmployeeFirstName, EmployeeLastName;
        int PreviousSalary;
        int Increase = 25;

        Scanner Name = new Scanner(System.in);

        System.out.println("Employee Information:");

        System.out.println("Enter Name: ");
        EmployeeFirstName = Name.nextLine();

        System.out.println("Enter surname: ");
        EmployeeLastName = Name.nextLine();

        System.out.println("Enter Current Salary: ");
        PreviousSalary = Name.nextInt();

        int CurrentSalary = PreviousSalary + (PreviousSalary * Increase/100);

        Employee EmployeeObject = new Employee();
        EmployeeObject.EmployeeSalary();

        System.out.println("Hello!" + EmployeeFirstName + " " + EmployeeLastName + ", After the increase of the Salary by 25%, Your current Salary is: " + CurrentSalary );

    }

}

/**package com.company;
import java.util.Scanner;
public class Employee {
    public static void main(String[] args) {
        String EmployeeFirstName, EmployeeLastName;
        int PreviousSalary;
        int Increase = 25;

        Scanner Name = new Scanner(System.in);

        System.out.println("Employee Information:\n");

        System.out.println("Enter Name: ");
        EmployeeFirstName = Name.nextLine();

        System.out.println("Enter surname: ");
        EmployeeLastName = Name.nextLine();

        System.out.println("Enter Current Salary: ");
        PreviousSalary = Name.nextInt();

        int CurrentSalary = PreviousSalary + (PreviousSalary * Increase/100);

        Employee EmployeeObject = new Employee();
        EmployeeObject.EmployeeSalary();

        System.out.println("Hello!" + EmployeeFirstName + " " + EmployeeLastName + ", After the increase of the Salary by 25%, Your current Salary is: " + CurrentSalary );
    }

}
 */