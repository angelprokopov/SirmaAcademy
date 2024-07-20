import java.io.File;
import java.util.Scanner;

public class EmployeeManagementApp {
    public static void main(String[] args) {
        File file = new File("employees.csv");
        EmployeeService service = new EmployeeService(file);
        EmployeeManager manager = new EmployeeManager(service);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Employee Management System");
        displayCommands();

        while (true) {
            System.out.println("Enter command:");
            String command = scanner.next();
            manager.execute(command);
        }
    }

    private static void displayCommands() {
        System.out.println("Commands:");
        System.out.println("add - Add a new employee");
        System.out.println("edit - Edit an existing employee");
        System.out.println("fire - Fire an employee");
        System.out.println("list - List all active employees");
        System.out.println("search - Search employees");
        System.out.println("save - Save data to file");
        System.out.println("exit - Save data and exit");
    }
}