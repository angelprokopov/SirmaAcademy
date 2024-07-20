import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
    private EmployeeService service;
    private Scanner scanner;

    public EmployeeManager(EmployeeService service) {
        this.service = service;
        this.scanner = new Scanner(System.in);
    }

    public void execute(String command) {
        switch (command.toLowerCase()) {
            case "add":
                addEmployee();
                break;
            case "edit":
                editEmployee();
                break;
            case "fire":
                fireEmployee();
                break;
            case "list":
                listEmployees();
                break;
            case "search":
                searchEmployees();
                break;
            case "save":
                service.saveToFile();
                System.out.println("Data saved.");
                break;
            case "exit":
                service.saveToFile();
                System.out.println("Data saved. Exiting.");
                System.exit(0);
                break;
            default:
                System.out.println("Unknown command.");
        }
    }

    private void addEmployee() {
        System.out.println("Enter employee details: ID Name Department Role Salary");
        int id = scanner.nextInt();
        String name = scanner.next();
        String department = scanner.next();
        String role = scanner.next();
        double salary = scanner.nextDouble();
        Employee employee = new Employee(id, name, LocalDate.now(), department, role, salary);
        service.addEmployee(employee);
    }

    private void editEmployee() {
        System.out.println("Enter employee ID to edit:");
        int id = scanner.nextInt();
        System.out.println("Enter new details: Name Department Role Salary");
        String name = scanner.next();
        String department = scanner.next();
        String role = scanner.next();
        double salary = scanner.nextDouble();
        service.editEmployee(id, name, department, role, salary);
    }

    private void fireEmployee() {
        System.out.println("Enter employee ID to fire:");
        int id = scanner.nextInt();
        service.fireEmployee(id);
    }

    private void listEmployees() {
        List<Employee> employees = service.listEmployees();
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }

    private void searchEmployees() {
        System.out.println("Enter search query (name, ID, or department):");
        String query = scanner.next();
        List<Employee> result = service.searchEmployees(query);
        for (Employee emp : result) {
            System.out.println(emp);
        }
    }
}
