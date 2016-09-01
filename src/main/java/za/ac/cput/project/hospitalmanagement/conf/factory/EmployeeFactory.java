package za.ac.cput.project.hospitalmanagement.conf.factory;


import za.ac.cput.project.hospitalmanagement.domain.Employee;
import za.ac.cput.project.hospitalmanagement.domain.Person;
import za.ac.cput.project.hospitalmanagement.domain.Treatment;

/**
 * Created by Karl
 */
public class EmployeeFactory {
    public static Employee createEmployee(Person person, String qualification, String employeeType, Treatment treatment) {
        Employee employee = new Employee
                .Builder(person)
                .qualification(qualification)
                .employeeType(employeeType)
                .treatment(treatment)
                .build();
        return employee;
    }
}
