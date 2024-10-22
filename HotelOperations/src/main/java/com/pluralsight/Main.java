package com.pluralsight;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello World");

        Employee e1 = new Employee(1,"Matt",
                "Tech" , 10,41);
        double totalPay = e1.getTotalPay();
        System.out.println(totalPay);
    }
}