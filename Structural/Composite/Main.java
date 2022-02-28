package Structural.Composite;

public class Main {
    public static void main(String[] args) {
        Developer dev1 = new Developer(100, "Ritik", "Pro Developer");
        Developer dev2 = new Developer(101, "karan", "Senior Developer");

        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Manager man1 = new Manager(200, "Rohit", "Teach Leader");
        Manager man2 = new Manager(201, "Sohit", "Business Analytics");

        CompanyDirectory manDirectory = new CompanyDirectory();
        manDirectory.addEmployee(man1);
        manDirectory.addEmployee(man2);

        //Root node
        CompanyDirectory director = new CompanyDirectory();
        director.addEmployee(engDirectory);
        director.addEmployee(manDirectory);

        director.employeeDetails();
    }
}