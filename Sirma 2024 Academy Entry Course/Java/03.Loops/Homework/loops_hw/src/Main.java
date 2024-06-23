public class Main {
    public static void main(String[] args) {

    }
    // Task 1: Numbers from 1 to 100
    public static void printNumbersTo100() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    // Task 2: Numbers N to 0 in reverse order
    public static void printNumbersReverse(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }

    // Task 3: Numbers 1 to N through 2
    public static void printNumbersStep2(int n) {
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }
    }

    // Task 4: Numbers 1 to N through M
    public static void printNumbersStepM(int n, int m) {
        for (int i = 1; i <= n; i += m) {
            System.out.println(i);
        }
    }

    // Task 5: Letters in a word
    public static void printLetters(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }

    // Task 6: Sum of vowels
    public static void printVowelSum(String text) {
        int sum = 0;
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'a') sum += 1;
            else if (c == 'e') sum += 2;
            else if (c == 'i') sum += 3;
            else if (c == 'o') sum += 4;
            else if (c == 'u') sum += 5;
        }
        System.out.println(sum);
    }

    // Task 7: Clock
    public static void printClock() {
        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                System.out.printf("%02d:%02d\n", hour, minute);
            }
        }
    }

    // Task 8: Multiplication table
    public static void printMultiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }
    }

    // Task 9: Sum of Even Numbers
    public static void printSumOfEvenNumbers(int n) {
        int sum = 0;
        for (int i = 2; i <= n * 2; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }

    // Task 10: Factorial Calculation
    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

    // Task 11: Number Reversal
    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    // Task 12: PseudoFibonacci Sequence Sum
    public static int pseudoFibonacciSum(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int a = 1, b = 1, sum = 2;
        for (int i = 2; i < n; i++) {
            int next = a + b;
            sum += next;
            a = b;
            b = next;
        }
        return sum;
    }

    // Task 13: Palindrome Check
    public static boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    // Task 14: Armstrong Number Check
    public static boolean isArmstrongNumber(int n) {
        int originalNumber = n;
        int numberOfDigits = String.valueOf(n).length();
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += (int) Math.pow(digit, numberOfDigits);
            n /= 10;
        }
        return sum == originalNumber;
    }

    // Task 15: Collatz Conjecture
    public static void collatzSequence(int n) {
        System.out.print(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            System.out.print(" " + n);
        }
        System.out.println();
    }

    // Task 16: Hollow Rectangle Pattern
    public static void printHollowRectangle(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Task 17: New Building
    public static void printBuilding(int floors, int rooms) {
        for (int floor = floors; floor >= 1; floor--) {
            for (int room = 0; room < rooms; room++) {
                if (floor == floors) {
                    System.out.print("L" + floor + room + " ");
                } else if (floor % 2 == 0) {
                    System.out.print("O" + floor + room + " ");
                } else {
                    System.out.print("A" + floor + room + " ");
                }
            }
            System.out.println();
        }
    }

    // Task 18: Magic Number
    public static void findMagicNumber(int start, int end, int magicNumber) {
        int combinationCount = 0;
        for (int i = start; i <= end; i++) {
            for (int j = i + 1; j <= end; j++) {
                combinationCount++;
                if (i + j == magicNumber) {
                    System.out.println("Combination " + combinationCount + " - (" + i + " + " + j + " = " + magicNumber + ")");
                    return;
                }
            }
        }
        System.out.println(combinationCount + " combinations - neither equals " + magicNumber);
    }

    // Task 19: Padawan Equipment
    public static void calculatePadawanEquipment(double money, int students, double lightsaberPrice, double robePrice, double beltPrice) {
        double sabersTotal = lightsaberPrice * Math.ceil(students * 1.1);
        double robesTotal = robePrice * students;
        double beltsTotal = beltPrice * (students - (double) students / 6);
        double totalCost = sabersTotal + robesTotal + beltsTotal;

        if (totalCost <= money) {
            System.out.printf("The money is enough - it would cost %.2flv.%n", totalCost);
        } else {
            System.out.printf("George Lucas will need %.2flv more.%n", totalCost - money);
        }
    }

    // Task 20: Rage Expenses
    public static void calculateRageExpenses(int lostGames, double headsetPrice, double mousePrice, double keyboardPrice, double displayPrice) {
        int trashedHeadsets = lostGames / 2;
        int trashedMice = lostGames / 3;
        int trashedKeyboards = lostGames / 6;
        int trashedDisplays = trashedKeyboards / 2;

        double totalExpenses = trashedHeadsets * headsetPrice + trashedMice * mousePrice + trashedKeyboards * keyboardPrice + trashedDisplays * displayPrice;
        System.out.printf("Rage expenses: %.2flv.%n", totalExpenses);
    }

    // Task 21: Refactor Sum of Odd Numbers
    public static void refactorSumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int oddNumber = 2 * i - 1;
            System.out.println(oddNumber);
            sum += oddNumber;
        }
        System.out.println("Sum: " + sum);
    }

    // Task 22: Numbers up to 1000, ending in 7
    public static void printNumbersEndingIn7() {
        for (int i = 7; i <= 1000; i += 10) {
            System.out.println(i);
        }
    }

    // Task 23: Numbers up to 1000, ending in n
    public static void printNumbersEndingInN(int n) {
        for (int i = n; i <= 1000; i += 10) {
            System.out.println(i);
        }
    }

    // Task 24: Encoding
    public static void encodeNumber(int number) {
        String numberStr = String.valueOf(number);
        StringBuilder reversed = new StringBuilder(numberStr).reverse();

        for (int i = 0; i < reversed.length(); i++) {
            int digit = reversed.charAt(i) - '0';
            if (digit == 0) {
                System.out.println("ZERO");
            } else {
                char symbol = (char) (digit + 33);
                for (int j = 0; j < digit; j++) {
                    System.out.print(symbol);
                }
                System.out.println();
            }
        }
    }

    // Task 25: Coins and Notes
    public static void findPaymentCombinations(int coins1, int coins2, int notes5, int sum) {
        for (int i = 0; i <= coins1; i++) {
            for (int j = 0; j <= coins2; j++) {
                for (int k = 0; k <= notes5; k++) {
                    if (i + j * 2 + k * 5 == sum) {
                        System.out.println(i + " * 1 lv. + " + j + " * 2 lv. + " + k + " * 5 lv. = " + sum + " lv.");
                    }
                }
            }
        }
    }

    // Task 26: Even Pairs
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void generateEvenPairs(int start1, int start2, int diff1, int diff2) {
        for (int i = start1; i <= start1 + diff1; i++) {
            for (int j = start2; j <= start2 + diff2; j++) {
                if (isPrime(i) && isPrime(j)) {
                    System.out.println("" + i + j);
                }
            }
        }
    }

    // Task 27: Change
    public static int calculateCoins(double change) {
        int coins = 0;
        int stotinki = (int) Math.round(change * 100);

        coins += stotinki / 200;
        stotinki %= 200;
        coins += stotinki / 100;
        stotinki %= 100;
        coins += stotinki / 50;
        stotinki %= 50;
        coins += stotinki / 20;
        stotinki %= 20;
        coins += stotinki / 10;
        stotinki %= 10;
        coins += stotinki / 5;
        stotinki %= 5;
        coins += stotinki / 2;
        stotinki %= 2;
        coins += stotinki;

        return coins;
    }

    // Task 28: Pyramid of Numbers
    public static void printPyramid(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    // Task 29: Unique Codes
    public static void generateUniqueCodes(int max1, int max2, int max3) {
        for (int i = 2; i <= max1; i += 2) {
            for (int j = 2; j <= max2; j++) {
                if (isPrime(j)) {
                    for (int k = 2; k <= max3; k += 2) {
                        System.out.println("" + i + j + k);
                    }
                }
            }
        }
    }

    // Task 30: Square of Asterisks
    public static void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Task 31: Half-Rhombus from Asterisks
    public static void printHalfRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Task 32: Rhombus from Asterisks
    public static void printRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Task 33: Tree Pattern
    public static void printTree(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

    // Task 34: Square Frame
    public static void printSquareFrame(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(j == 1 || j == n ? "+" : "-");
                } else {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }

    // Task 35: Christmas Tree
    public static void printChristmasTree(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Task 36: Sunglasses
    public static void printSunglasses(int n) {
        int width = 5 * n;
        int height = n;
        System.out.println("*".repeat(width));
        for (int i = 0; i < height - 2; i++) {
            System.out.print("*");
            System.out.print("/".repeat(width - 2));
            System.out.print("*");
            if (i == (height - 2) / 2) {
                System.out.print("|".repeat(n));
            } else {
                System.out.print(" ".repeat(n));
            }
            System.out.print("*");
            System.out.print("/".repeat(width - 2));
            System.out.println("*");
        }
        System.out.println("*".repeat(width));
    }

    // Task 37: House Pattern
    public static void printHouse(int n) {
        for (int i = 1; i <= (n + 1) / 2; i++) {
            for (int j = 1; j <= (n - (2 * i - 1)) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n / 2; i++) {
            System.out.print("|");
            for (int j = 1; j <= n - 2; j++) {
                System.out.print("*");
            }
            System.out.println("|");
        }
    }

    // Task 38: Pyramid with Increasing Digits
    public static void printPyramidDigits(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Task 39: Arrow Pattern
    public static void printArrowPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Task 40: Staircase Pattern
    public static void printStaircase(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    // Task 41: Hourglass Pattern
    public static void printHourglass(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - 2 * i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - 2 * i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    // Task 42: Left Arrow Pattern
    public static void printLeftArrow(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Task 43: Pyramid of Numbers

    // Task 45: Equal Sum of Odd and Even Positions
    public static void printEqualSumNumbers(int start, int end) {
        boolean found = false;
        for (int num = start; num <= end; num++) {
            int oddSum = 0, evenSum = 0;
            String numStr = String.valueOf(num);
            for (int i = 0; i < numStr.length(); i++) {
                int digit = numStr.charAt(i) - '0';
                if (i % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
            }
            if (oddSum == evenSum) {
                System.out.println(num);
                found = true;
            }
        }
        if (!found) {
            System.out.println("None");
        }
    }

    // Task 46: Password Generator
    public static void generatePasswords(int n, int l) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (char k = 'a'; k < 'a' + l; k++) {
                    for (char m = 'a'; m < 'a' + l; m++) {
                        for (int o = Math.max(i, j) + 1; o <= n; o++) {
                            System.out.println("" + i + j + k + m + o);
                        }
                    }
                }
            }
        }
    }

    // Task 47: Special Numbers
    public static void generateSpecialNumbers(int n) {
        for (int num = 1111; num <= 9999; num++) {
            String numStr = String.valueOf(num);
            boolean isSpecial = true;
            for (int i = 0; i < numStr.length(); i++) {
                int digit = numStr.charAt(i) - '0';
                if (digit == 0 || num % digit != 0) {
                    isSpecial = false;
                    break;
                }
            }
            if (isSpecial) {
                System.out.println(num);
            }
        }
    }

}