package com.carlocappellini;

public class YearlySalaryHourlyRate {
    public static void main(String[] args) {

        yearlySalaryHourlyPayProgram("carlo", 45000);


    }


    public static void yearlySalaryHourlyPayProgram(String name, double salary) {
        System.out.println("your name is " + name + " and make " + " $ " + salary + " yearly");


        if (salary >= 80000 && salary <= 100000 || salary >= 100000) {
            System.out.println("Your yearly salary is extremely high");

        } else if (salary <= 70000 && salary >= 60000) {
            System.out.println("Your Yearly pay is really high ");

        } else if (salary <= 50000 && salary >= 40000) {
            System.out.println("Your yearly salary is average high");

        } else if (salary <= 40000 && salary >= 30000) {
            System.out.println("Your Yearly salary is average");


        } else if (salary <= 30000 && salary >= 25000) {
            System.out.println("Your Yearly salary is average low");


        } else {
            System.out.println("this is consider poor");
        }

        double monthlySalary = (salary / 12);
        System.out.println("Your monthly Pay is " + " $ " + monthlySalary);

        double weeklySalary = (monthlySalary / 4);
        System.out.println("Your weekly pay is " + " $ " + weeklySalary);

        double dailyPay = (weeklySalary / 5);
        System.out.println("each day you make " + " $ " + dailyPay);

        double hourlyRate = (dailyPay / 8);
        System.out.println("Your hourly rate stars at " + " $ " + hourlyRate);


    }


}
