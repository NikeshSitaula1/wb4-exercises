package com.pluralsight;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked){
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

    public double getHoursWorked(){
        return hoursWorked;
    }

    public double getRegularHours(){
        double regularHours = 0;
        if (this.hoursWorked <= 40 && this.hoursWorked > 0){
            regularHours =  this.payRate * this.hoursWorked;
        }

        return regularHours;
    }

    public double getOvertimeHours() throws Exception{
        double overtimeHours = 0;
        if (this.hoursWorked > 40){
            overtimeHours = (this.payRate * 1.5) * (this.hoursWorked - 40);
        }
        return overtimeHours;
    }

    public double getTotalPay() throws Exception{
        return this.getRegularHours() + this.getOvertimeHours();
    }
}
