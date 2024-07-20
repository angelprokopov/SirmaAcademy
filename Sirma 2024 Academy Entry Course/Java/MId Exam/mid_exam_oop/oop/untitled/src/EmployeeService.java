import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();
    private File file;

    public EmployeeService(File file) {
        this.file = file;
        loadFromFile();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void editEmployee(int id, String name, String department, String role, double salary) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                emp.setName(name);
                emp.setDepartment(department);
                emp.setRole(role);
                emp.setSalary(salary);
            }
        }
    }

    public void fireEmployee(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                emp.setEndDate(LocalDate.now());
                emp.setActive(false);
            }
        }
    }

    public List<Employee> listEmployees() {
        List<Employee> activeEmployees = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.isActive()) {
                activeEmployees.add(emp);
            }
        }
        return activeEmployees;
    }

    public List<Employee> searchEmployees(String query) {
        List<Employee> result = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getName().equalsIgnoreCase(query) || emp.getDepartment().equalsIgnoreCase(query) || String.valueOf(emp.getId()).equals(query)) {
                result.add(emp);
            }
        }
        return result;
    }

    public void saveToFile() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(file))) {
            for (Employee emp : employees) {
                pw.println(emp.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadFromFile() {
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    employees.add(Employee.fromCSV(line));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
