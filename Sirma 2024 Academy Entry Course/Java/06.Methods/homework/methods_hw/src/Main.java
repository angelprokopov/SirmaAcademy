public class Main {
    public static void main(String[] args) {

    }
    // Task 1: Sign of Integer
    public static void printSign(int number) {
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number 0 is zero.");
        }
    }

    // Task 2: Grades
    public static void printGrade(double grade) {
        if (grade >= 2.00 && grade <= 2.99) {
            System.out.println("Fail");
        } else if (grade <= 3.49) {
            System.out.println("Poor");
        } else if (grade <= 4.49) {
            System.out.println("Good");
        } else if (grade <= 5.49) {
            System.out.println("Very good");
        } else if (grade <= 6.00) {
            System.out.println("Excellent");
        }
    }

    // Task 3: Printing Triangle
    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Task 4: Calculator
    public static void calculate(String operator, double a, double b) {
        double result;
        switch (operator) {
            case "add":
                result = a + b;
                break;
            case "multiply":
                result = a * b;
                break;
            case "subtract":
                result = a - b;
                break;
            case "divide":
                result = a / b;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println(result);
    }

    // Task 5: Shop
    public static void calculateOrder(String product, int quantity) {
        double price;
        switch (product) {
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1.00;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2.00;
                break;
            default:
                System.out.println("Invalid product");
                return;
        }
        double totalPrice = price * quantity;
        System.out.printf("%.2f%n", totalPrice);
    }

    // Task 6: Calculate Rectangle Area
    public static double calculateArea(double width, double length) {
        return width * length;
    }

    // Task 7: Repeat String
    public static String repeatString(String str, int count) {
        return str.repeat(count);
    }

    // Task 8: Math Power
    public static double mathPower(double number, int power) {
        return Math.pow(number, power);
    }

    // Task 9: Greater of Two Values
    public static int getMax(int first, int second) {
        return Math.max(first, second);
    }
    public static char getMax(char first, char second) {
        return (char) Math.max(first, second);
    }
    public static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        } else {
            return second;
        }
    }

    // Task 10: Multiply Evens by Odds
    public static int getMultipleOfEvensAndOdds(int n) {
        int evenSum = getSumOfEvenDigits(n);
        int oddSum = getSumOfOddDigits(n);
        return evenSum * oddSum;
    }

    private static int getSumOfEvenDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            n /= 10;
        }
        return sum;
    }

    private static int getSumOfOddDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            n /= 10;
        }
        return sum;
    }

    // Task 11: Math Operations
    public static double calculate(double a, String operator, double b) {
        return switch (operator) {
            case "/" -> a / b;
            case "*" -> a * b;
            case "+" -> a + b;
            case "-" -> a - b;
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }

    // Task 12: Password Validator
    public static void validatePassword(String password) {
        boolean isValid = true;

        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            isValid = false;
        }

        if (!password.matches("[a-zA-Z0-9]+")) {
            System.out.println("Password must contain only letters and digits");
            isValid = false;
        }

        int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        if (digitCount < 2) {
            System.out.println("Password must have at least 2 digits");
            isValid = false;
        }

        if (isValid) {
            System.out.println("Password is valid");
        }
    }
}