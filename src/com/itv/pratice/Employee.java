package com.itv.pratice;

public class Employee {
  private int id;
  private String empName;
  private String dept;
  private int salary;

  public int getId() {
    return id;
  }

  public String getEmpName() {
    return empName;
  }

  public String getDept() {
    return dept;
  }

  public int getSalary() {
    return salary;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public Employee(int id, String empName, String dept, int salary) {
    this.id = id;
    this.empName = empName;
    this.dept = dept;
    this.salary = salary;
  }

  public Employee() {
  }

  @Override
  public String toString() {
    return "Employee{" +
            "id=" + id +
            ", empName='" + empName + '\'' +
            ", dept='" + dept + '\'' +
            ", salary=" + salary +
            '}';
  }

}
