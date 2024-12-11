public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        DatabaseHandler dbHandler = new DatabaseHandler();
        dbHandler.connect();
        Employee emp1 = new Employee(1, "John Doe", "Software Engineer", 60000);
        Employee emp2 = new Employee(2, "Jane Smith", "HR Manager", 70000);
        manager.addEmployee(emp1);
        dbHandler.addEmployeeToDatabase(emp1);

        manager.addEmployee(emp2);
        dbHandler.addEmployeeToDatabase(emp2);
        System.out.println("\nEmployees in memory:");
        manager.getAllEmployees();

        System.out.println("\nEmployees in database:");
        dbHandler.fetchEmployeesFromDatabase();
        manager.deleteEmployee(1);
    }
}
public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        DatabaseHandler dbHandler = new DatabaseHandler();
        dbHandler.connect();
        Employee emp1 = new Employee(1, "John Doe", "Software Engineer", 60000);
        Employee emp2 = new Employee(2, "Jane Smith", "HR Manager", 70000);
        manager.addEmployee(emp1);
        dbHandler.addEmployeeToDatabase(emp1);

        manager.addEmployee(emp2);
        dbHandler.addEmployeeToDatabase(emp2);
        System.out.println("\nEmployees in memory:");
        manager.getAllEmployees();

        System.out.println("\nEmployees in database:");
        dbHandler.fetchEmployeesFromDatabase();
        manager.deleteEmployee(1);
    }
}
