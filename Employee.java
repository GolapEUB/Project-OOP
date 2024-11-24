public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String dob;
    private String gender;
    private String maritalStatus;
    private String address;
    private String phoneNumber;
    private String email;
    private String jobTitle;
    private String department;
    private int managerId;
    private String dateOfJoining;
    private double salary;
    private String status;

    public Employee(int employeeId, String firstName, String lastName, String dob, String gender,
                    String maritalStatus, String address, String phoneNumber, String email,
                    String jobTitle, String department, int managerId, String dateOfJoining,
                    double salary, String status) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.jobTitle = jobTitle;
        this.department = department;
        this.managerId = managerId;
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
        this.status = status;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

}
