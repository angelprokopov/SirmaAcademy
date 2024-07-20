import java.time.LocalDate;

public class Employee {
    private int id;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private String department;
    private String role;
    private double salary;
    private boolean isActive;

    public Employee(int id, String name, LocalDate startDate, String department, String role, double salary) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = null;
        this.department = department;
        this.role = role;
        this.salary = salary;
        this.isActive = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + startDate + "," + (endDate == null ? "null" : endDate) + "," + department + "," + role + "," + salary + "," + isActive;
    }

    public static Employee fromCSV(String csv) {
        String[] parts = csv.split(",");
        Employee emp = new Employee(
                Integer.parseInt(parts[0]),
                parts[1],
                LocalDate.parse(parts[2]),
                parts[4],
                parts[5],
                Double.parseDouble(parts[6])
        );
        if (!"null".equals(parts[3])) {
            emp.setEndDate(LocalDate.parse(parts[3]));
        }
        emp.setActive(Boolean.parseBoolean(parts[7]));
        return emp;
    }
}
