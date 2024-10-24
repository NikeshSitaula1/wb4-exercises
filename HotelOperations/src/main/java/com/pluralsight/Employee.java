package com.pluralsight;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private float hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, float hoursWorked){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    public double getPayRate(){
        return payRate;
    }

    public float getHoursWorked(){
        return hoursWorked;
    }


    public double getRegularHours(){
        return (hoursWorked > 40) ? 40 : hoursWorked;
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5;
        return regularPay + overtimePay;
    }

    public double getOvertimeHours() {
        return (hoursWorked > 40) ? hoursWorked - 40 : 0;
    }


    public void punchIn(double time){
        System.out.println(name + "punched in at " + time);
    }

    public void punchOut(double time){
        hoursWorked += (float) time;
        System.out.println(hoursWorked);
    }
}
