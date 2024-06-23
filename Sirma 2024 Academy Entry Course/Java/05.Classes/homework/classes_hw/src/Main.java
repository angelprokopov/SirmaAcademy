public class Main {
    public static void main(String[] args) {

    }

    // Task 1: Car Info & Task 2: Car Constructors
    class Car {
        private String brand;
        private String model;
        private int horsePower;

        public Car(String brand, String model, int horsePower) {
            this.brand = brand;
            this.model = model;
            this.horsePower = horsePower;
        }
        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getHorsePower() {
            return horsePower;
        }
        public String carInfo() {
            return String.format("The car is: %s %s - %d HP.", brand, model, horsePower);
        }

        public Car(String brand) {
            this(brand, "unknown", -1);
        }
    }

    // Task 3: Bank Account
    class BankAccount {
        private static double interestRate = 0.02;
        private static int nextId = 1;
        private int id;
        private double balance;

        public BankAccount() {
            this.id = nextId++;
            this.balance = 0;
        }
        public static void setInterestRate(double interest) {
            interestRate = interest;
        }

        public double getInterest(int years) {
            return balance * interestRate * years;
        }

        public void deposit(double amount) {
            balance += amount;
        }
        
    }

    // Task 4: Class Vehicle
    class Vehicle {

        public Vehicle(String type, String model, Engine engine, double fuel) {

        }

        // drive method
        public void drive(double fuelLoss) {

        }
    }

    class Engine {

    }

}