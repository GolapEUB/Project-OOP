import java.sql.*;

public class DatabaseHandler {
    private Connection connection;
    public void connect() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrms", "root", "");
            System.out.println("Connected to database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addEmployeeToDatabase(Employee employee) {
        String query = "INSERT INTO Employee (name, designation, salary) VALUES (?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, employee.getName());
            stmt.setString(2, employee.getDesignation());
            stmt.setDouble(3, employee.getSalary());
            stmt.executeUpdate();
            System.out.println("Employee added to database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void fetchEmployeesFromDatabase() {
        String query = "SELECT * FROM Employee";
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name") +
                                   ", Designation: " + rs.getString("designation") +
                                   ", Salary: " + rs.getDouble("salary"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
import java.sql.*;

public class DatabaseHandler {
    private Connection connection;
    public void connect() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrms", "root", "");
            System.out.println("Connected to database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addEmployeeToDatabase(Employee employee) {
        String query = "INSERT INTO Employee (name, designation, salary) VALUES (?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, employee.getName());
            stmt.setString(2, employee.getDesignation());
            stmt.setDouble(3, employee.getSalary());
            stmt.executeUpdate();
            System.out.println("Employee added to database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void fetchEmployeesFromDatabase() {
        String query = "SELECT * FROM Employee";
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name") +
                                   ", Designation: " + rs.getString("designation") +
                                   ", Salary: " + rs.getDouble("salary"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
