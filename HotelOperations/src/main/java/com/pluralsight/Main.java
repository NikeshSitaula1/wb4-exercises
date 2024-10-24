package com.pluralsight;

public class Main {
    public static void main(String[] args) throws Exception {

        testEmployee();
    }

    public static void testEmployee(){
        Employee e1 = new Employee(1,"Matt",
                "Tech" , 10,41);
        double totalPay = e1.getTotalPay();
        System.out.println(totalPay);
    }


    public static void testRoom()  {
        Room r1 = new Room(2, 120, false, false);
        r1.checkIn();
        r1.checkOut();
    }
}