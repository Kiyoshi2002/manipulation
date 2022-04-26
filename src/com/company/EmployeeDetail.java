/**package com.company;

import java.util.Scanner;

public class EmployeeDetail {
    private static float salary;
    private float hours;

    public void getInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill out employee Details");

        System.out.println("Enter Hourly Rate (PHP)");
        float sal = sc.nextFloat();
        System.out.println("Enter daily working hours:");
        float hr = sc.nextFloat();

        double FinalSal = sal * hr;
        double DaySal = 25 * FinalSal;
        System.out.println("Computing Monthly Salary....\n" + DaySal);

    }

    public float AddSal() {
        if (salary < 10000){
            salary = salary + 4000;
        }
        return salary;
    }

    public float AddWork() {
        if (hours > 6) {
            salary = salary + 2000;
        }
        return salary;
    }
    public float finalSal(){
        return salary + AddSal();
    }

    public static void main(String[] args) {
        EmployeeDetail e = new EmployeeDetail();
        e.getInfo();
        e.AddSal();
        e.AddWork();

        System.out.println("Monthly Salary is not Livable Wage, adding salary..\n" +
                "Working Hours is more than Required, adding Overtime pay...\n" +
                "Final Salary = " + e.finalSal());

    
    }
}
  /*8public float finalSal(){
 return getSalary() * 25;
 }

package com.company;

import java.util.Scanner;

public class EmployeeDetail {
    private static float salary;
    private float hours;
    private Object hr;
    private Object sal;

    public void setInfo(float sal, float hr) {
        salary = sal;
        hours = hr;
    }



        /**double FinalSal = sal * hr;
        double DaySal = 25 * FinalSal;
        System.out.println("Computing Monthly Salary....\n" + DaySal);

    }*/
/**package com.company;

import java.util.Scanner;

public class EmployeeDetail {

    public static float salary;
    private float hours;
    private Object hr;
    private Object sal;

    public void getInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill out employee Details");
    }

    public static float setSal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hourly Rate (PHP)");
        float sal = sc.nextFloat();
        return salary;
    }

    public static float setHr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter daily working hours:");
        float hr = sc.nextFloat();
        return salary;
    }

    public static float computeDetail() {
        int Detail = (int) (setSal() * setHr());
        return salary;
    }

    public float AddWork() {
        if (6 < setHr()) {
            hr = salary + 2000;
        }
        return salary;
    }

    public float AddSal() {
        if (computeDetail() < 10000) {
            salary = computeDetail() + 4000;
        }
        return salary;
    }


    public float finalSal() {
        return AddSal();
    }

    public static void main(String[] args) {
        EmployeeDetail e = new EmployeeDetail();
        e.getInfo();
        e.setSal();
        e.setHr();
        e.AddSal();
        e.AddWork();

        System.out.println("Monthly Salary is not Livable Wage, adding salary..\n" +
                "Working Hours is more than Required, adding Overtime pay...\n" +
                "Final Salary = " + e.finalSal());


    }
}
 */

