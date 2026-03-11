package com.yu.DSA.DesignPatterns.Creational;

public class PrototypeDP {
    public static void main(String[] args) {
        Employee emp = new Employee(111, "Yogesh");

        Employee clonedEmp = emp.clone();

        System.out.println(clonedEmp);
    }
}
interface Prototype {
    Prototype clone();
}

class Employee implements Prototype {
    private int empId;
    private String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public Employee clone() {
        return new Employee(empId, empName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}