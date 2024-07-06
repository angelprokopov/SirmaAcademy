public class Main {
    public static void main(String[] args) {

    }

    // 1. Single Responsibility Principle (SRP)
    // Task 1
    public class Book {
        private String title;
        private String author;
        // ... other properties

        public String getBookSummary() {
            return title + " by " + author;
        }
    }

    public class BookRepository {
        public void saveToDatabase(Book book) {
            // Save book to the database
        }
    }

    // Task 2
    public class Invoice {
        private double amount;
        private String customerName;
        // ... other properties

        public double getAmount() {
            return amount;
        }

        public String getCustomerName() {
            return customerName;
        }
    }

    public class InvoicePrinter {
        public void printInvoice(Invoice invoice) {
            // Print invoice
        }
    }

    public class InvoiceRepository {
        public void saveInvoice(Invoice invoice) {
            // Save invoice to database
        }
    }


    // 2. Open/Closed Principle (OCP)
    // Task 1
    public interface Logger {
        void log(String message);
    }

    public class ConsoleLogger implements Logger {
        @Override
        public void log(String message) {
            System.out.println(message);
        }
    }

    public class FileLogger implements Logger {
        private String filename;

        public FileLogger(String filename) {
            this.filename = filename;
        }

        @Override
        public void log(String message) {
            // Code to write message to a file
        }
    }

    // Task 2
    public interface Discount {
        double apply(double price);
    }

    public class StudentDiscount implements Discount {
        @Override
        public double apply(double price) {
            return price * 0.1;
        }
    }

    public class SeniorDiscount implements Discount {
        @Override
        public double apply(double price) {
            return price * 0.2;
        }
    }

    public class DiscountCalculator {
        public double calculateDiscount(Discount discount, double price) {
            return discount.apply(price);
        }
    }

    // 3. Liskov Substitution Principle (LSP)
    // Task 1
    public abstract class Engine {
        public abstract void start();
    }

    public class GasolineEngine extends Engine {
        @Override
        public void start() {
            // Start the engine
        }
    }

    public class ElectricEngine extends Engine {
        @Override
        public void start() {
            // Start the electric engine
        }
    }

    // Task 2
    public abstract class Bird {
        public abstract void move();
    }

    public class FlyingBird extends Bird {
        @Override
        public void move() {
            fly();
        }

        public void fly() {
            // ...
        }
    }

    public class Penguin extends Bird {
        @Override
        public void move() {
            swim();
        }

        public void swim() {
            // ...
        }
    }

    // 4. Interface Segregation Principle (ISP)
    // Task 1
    public interface Printer {
        void print();
    }

    public interface Fax {
        void fax();
    }

    public interface Scanner {
        void scan();
    }

    public class MultiFunctionPrinter implements Printer, Fax, Scanner {
        @Override
        public void print() {
            // Print
        }

        @Override
        public void fax() {
            // Fax
        }

        @Override
        public void scan() {
            // Scan
        }
    }

    public class SimplePrinter implements Printer {
        @Override
        public void print() {
            // Print
        }
    }

    // Task 2
    public interface BasicPlayer {
        void play();
        void pause();
    }

    public interface AdvancedPlayer extends BasicPlayer {
        void next();
        void previous();
        void shuffle();
    }

    public class SimpleMediaPlayer implements BasicPlayer {
        @Override
        public void play() {
            // Play
        }

        @Override
        public void pause() {
            // Pause
        }
    }

    public class AdvancedMediaPlayer implements AdvancedPlayer {
        @Override
        public void play() {
            // Play
        }

        @Override
        public void pause() {
            // Pause
        }

        @Override
        public void next() {
            // Next
        }

        @Override
        public void previous() {
            // Previous
        }

        @Override
        public void shuffle() {
            // Shuffle
        }
    }

    // 5. Dependency Inversion Principle (DIP)
    // Task 1
    public interface Switchable {
        void turnOn();
        void turnOff();
    }

    public class LightSwitch {
        private Switchable device;

        public LightSwitch(Switchable device) {
            this.device = device;
        }

        public void operate() {
            // Toggle device state
        }
    }

    public class Bulb implements Switchable {
        @Override
        public void turnOn() { /*...*/ }

        @Override
        public void turnOff() { /*...*/ }
    }

    // Task 2
    public interface TemperatureSensor {
        double getTemperature();
    }

    public class WeatherReporter {
        private TemperatureSensor sensor;

        public WeatherReporter(TemperatureSensor sensor) {
            this.sensor = sensor;
        }

        public String report() {
            return "Current temperature: " + sensor.getTemperature();
        }
    }

    public class BasicTemperatureSensor implements TemperatureSensor {
        @Override
        public double getTemperature() {
            // Return temperature from sensor
            return 25.0; // dummy value
        }
    }

}