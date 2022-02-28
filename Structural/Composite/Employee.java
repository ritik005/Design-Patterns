package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

interface Employee
{
    public void employeeDetails();
}

//Leaf
class Developer implements Employee
{
    private String name;
    private long empId;
    private String position;

    public Developer(long empId, String name, String position)
    {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void employeeDetails() 
    {
        System.out.println(empId + " " + name + " " + position );
    }
    
}

//Leaf
class Manager implements Employee
{
    private String name;
    private long empId;
    private String position;

    public Manager(long empId, String name, String position)
    {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void employeeDetails() 
    {
        System.out.println(empId + " " + name + " " + position );
    }
}

//Composite
class CompanyDirectory implements Employee
{
    private List<Employee> employeeList = new ArrayList<Employee>();

    @Override
    public void employeeDetails() 
    {
        for (Employee emp : employeeList)
        {
            emp.employeeDetails();
        }
    }

    public void addEmployee(Employee emp)
    {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp)
    {
        employeeList.remove(emp);
    }
    
}