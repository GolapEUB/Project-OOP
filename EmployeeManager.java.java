import java.util.ArrayList;

import java.util.ArrayList;

public class EmployeeManager {
    private ArrayList<Employee> employees;
    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added successfully.");
    }
    public void getAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public void deleteEmployee(int id) {
        employees.removeIf(employee -> employee.getId() == id);
        System.out.println("Employee deleted successfully.");
    }
}
