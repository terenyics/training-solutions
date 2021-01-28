package debug.employee;

import java.util.ArrayList;
import java.util.List;

public class CompanyMain {

    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", 1980);
        Employee employee2 = new Employee("Jack Doe", 1981);
        Employee employee3 = new Employee("Jane Doe", 1982);

        Company company = new Company(new ArrayList<>());

        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);

        Employee jack = company.findEmployeeByName("Jack Doe");
        System.out.println(jack.getName() + " " + jack.getYearOfBirth());

        List<String> names = company.listEmployeeNames();
        System.out.println(names);
    }
}
