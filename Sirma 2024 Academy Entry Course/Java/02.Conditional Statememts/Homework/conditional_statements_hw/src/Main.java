import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    }
    // 1. Marks
    public static void checkExcellentRating(double mark) {
        if (mark >= 5.50) {
            System.out.println("Excellent!");
        }
    }
    // 2. Larger number
    public static void printLargerNumber(int num1, int num2) {
        System.out.println(Math.max(num1, num2));
    }
    // 3. Number from 0 to 9 with Words
    public static void spellNumber(int num) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if (num >= 0 && num <= 9) {
            System.out.println(words[num]);
        } else {
            System.out.println("too big");
        }
    }
    // 4. Face of Figures
    public static void calculateFace(String figure, double... dimensions) {
        double face = switch (figure) {
            case "square" -> dimensions[0] * dimensions[0];
            case "rectangle" -> dimensions[0] * dimensions[1];
            case "circle" -> Math.PI * dimensions[0] * dimensions[0];
            case "triangle" -> 0.5 * dimensions[0] * dimensions[1];
            default -> 0;
        };
        System.out.printf("%.2f\n", face);
    }
    // 5. Day of the Week
    public static void printDayOfWeek(int day) {
        String[] days = {"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (day >= 1 && day <= 7) {
            System.out.println(days[day]);
        } else {
            System.out.println("Error");
        }
    }
    // 6. Even or odd
    public static void checkEvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
    // 7. Speed
    public static void printSpeedInfo(double speed) {
        if (speed <= 10) {
            System.out.println("slow");
        } else if (speed <= 60) {
            System.out.println("average");
        } else if (speed <= 120) {
            System.out.println("fast");
        } else if (speed <= 160) {
            System.out.println("super-fast");
        } else {
            System.out.println("turbo-fast");
        }
    }
    // 8. Alarm after 15 minutes
    public static void printAlarmTime(int hour, int minutes) {
        minutes += 15;
        if (minutes >= 60) {
            hour = (hour + 1) % 24;
            minutes -= 60;
        }
        System.out.printf("%02d:%02d\n", hour, minutes);
    }
    // 9. Address by Age and Gender
    public static void printAddress(int age, char gender) {
        if (gender == 'f') {
            if (age >= 16) {
                System.out.println("Ms.");
            } else {
                System.out.println("Miss");
            }
        } else if (gender == 'm') {
            if (age >= 16) {
                System.out.println("Mr.");
            } else {
                System.out.println("Master");
            }
        }
    }
    // 10. Weather forecast
    public static void printForecast(int degrees) {
        if (degrees >= 26.00) {
            System.out.println("Hot");
        } else if (degrees >= 20.1) {
            System.out.println("Warm");
        } else if (degrees >= 15.00) {
            System.out.println("Mild");
        } else if (degrees >= 12.00) {
            System.out.println("Cool");
        } else if (degrees >= 5.00) {
            System.out.println("Cold");
        } else {
            System.out.println("unknown");
        }
    }
    // 11. Fruit or vegetable
    public static void classifyFood(String product) {
        String[] fruits = {"banana", "apple", "kiwi", "cherry", "lemon", "grapes"};
        String[] vegetables = {"tomato", "cucumber", "pepper", "carrot"};
        if (Arrays.asList(fruits).contains(product)) {
            System.out.println("fruit");
        } else if (Arrays.asList(vegetables).contains(product)) {
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }
    }
    // 12. Invalid Number
    public static void checkInvalidNumber(int num) {
        if (num >= 100 && num <= 200 || num == 0) {
            System.out.println(); // Print empty line
        } else {
            System.out.println(num);
        }
    }
    // 13. Point on Rectangle Border
    public static void checkPointOnBorder(double x1, double y1, double x2, double y2, double x, double y) {
        if ((x == x1 || x == x2) && (y >= y1 && y <= y2) ||
                (y == y1 || y == y2) && (x >= x1 && x <= x2)) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
    // 14. Fruit Shop
    public static void calculateFruitPrice(String fruit, String day, double quantity) {
        Map<String, Map<String, Double>> prices = new HashMap<>();
        if (prices.containsKey(fruit) && prices.get(fruit).containsKey(day)) {
            double price = prices.get(fruit).get(day) * quantity;
            System.out.printf("%.2f\n", price);
        } else {
            System.out.println("error");
        }
    }
    // 15. Small Shop
    public static void calculateProductPrice(String product, String town, double quantity) {
        Map<String, Map<String, Double>> prices = new HashMap<>();
        if (prices.containsKey(product) && prices.get(product).containsKey(town)) {
            double price = prices.get(product).get(town) * quantity;
            System.out.printf("%.2f\n", price);
        }
    }
    // 16. Cinema
    public static void calculateTicketPrice(String type, int rows, int columns) {
        int totalSeats = rows * columns;
        double price = switch (type) {
            case "Premiere" -> 12.00;
            case "Normal" -> 7.50;
            case "Discount" -> 5.00;
            default -> 0;
        };
        double totalPrice = totalSeats * price;
        System.out.printf("%.2f leva\n", totalPrice);
    }
    // 17. Ski Trip
    public static void calculateTripPrice(String type, String room, int nights) {
        double pricePerNight = switch (room) {
            case "room for one person" -> 18.00;
            case "apartment" -> 25.00;
            case "president apartment" -> 35.00;
            default -> 0;
        };
        double totalPrice = pricePerNight * nights;
        if (nights < 10) {
            switch (room) {
                case "apartment":
                    totalPrice *= 0.70;
                    break;
                case "president apartment":
                    totalPrice *= 0.90;
                    break;
            }
        } else if (nights <= 15) {
            switch (room) {
                case "apartment":
                    totalPrice *= 0.65;
                    break;
                case "president apartment":
                    totalPrice *= 0.85;
                    break;
            }
        } else {
            switch (room) {
                case "apartment":
                    totalPrice *= 0.50;
                    break;
                case "president apartment":
                    totalPrice *= 0.80;
                    break;
            }
        }
        if (type.equals("positive")) {
            totalPrice *= 1.25;
        } else if (type.equals("negative")) {
            totalPrice *= 0.90;
        }
        System.out.printf("%.2f\n", totalPrice);
    }
    // 18.  Point on Segment
    public static void checkPointOnSegment(int first, int second, int point) {
        if (point >= Math.min(first, second) && point <= Math.max(first, second)) {
            System.out.println("in");
        } else {
            System.out.println("out");
        }
        System.out.println(Math.min(Math.abs(first - point), Math.abs(second - point)));
    }
    // 19. Volleyball
    public static void calculateJumps(String year, int holidays, int weekendsHome) {
        int weekendsInYear = 48;
        double playDays = weekendsHome + holidays * 2.0 / 3 + (weekendsInYear - weekendsHome) * 3.0 / 4;
        if (year.equals("leap")) {
            playDays *= 1.15;
        }
        System.out.println((int) Math.floor(playDays));
    }
    // 20. Sleepy Tom Cat
    public static void calculateDifference(int restDays) {
        int playMinutes = 30000 - restDays * 127;
        int hours = playMinutes / 60;
        int minutes = playMinutes % 60;
        if (playMinutes > 30000) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play\n", hours, minutes);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play\n", hours, minutes);
        }
    }
    // 21. Operations between Numbers
    public static void performOperation(int num1, String operator, int num2) {
        double result = 0;
        switch (operator) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> {
                if (num2 != 0) {
                    result = (double) num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero");
                    return;
                }
            }
            case "%" -> {
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Cannot divide by zero");
                    return;
                }
            }
        }
        String evenOrOdd = (result % 2 == 0) ? "even" : "odd";
        System.out.printf("%d %s %d = %.0f - %s\n", num1, operator, num2, result, evenOrOdd);
    }
    // 22. Fishing Boat
    public static void calculateFishingCost(int budget, String season, int fishermen) {
        double boatRent = switch (season) {
            case "Spring" -> 3000;
            case "Summer", "Autumn" -> 4200;
            case "Winter" -> 2600;
            default -> 0;
        };
        if (fishermen <= 6) {
            boatRent *= 0.90;
        } else if (fishermen <= 11) {
            boatRent *= 0.85;
        } else {
            boatRent *= 0.75;
        }
        if (fishermen % 2 == 0 && !season.equals("Autumn")) {
            boatRent *= 0.95;
        }
        double difference = Math.abs(budget - boatRent);
        if (budget >= boatRent) {
            System.out.printf("Yes! You have %.2f leva left.\n", difference);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.\n", difference);
        }
    }
    // 23. Journey
    public static void planJourney(double budget, String season) {
        String destination = "";
        String type = "";
        double cost = 0;
        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                type = "Camp";
                cost = budget * 0.30;
            } else {
                type = "Hotel";
                cost = budget * 0.70;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                type = "Camp";
                cost = budget * 0.40;
            } else {
                type = "Hotel";
                cost = budget * 0.80;
            }
        } else {
            destination = "Europe";
            type = "Hotel";
            cost = budget * 0.90;
        }
        System.out.printf("Somewhere in %s\n%s - %.2f\n", destination, type, cost);
    }
    // 24. Summer outfit
    public static void suggestOutfit(int degrees, String timeOfDay) {
        String outfit = "";
        String shoes = "";
        if (degrees >= 10 && degrees <= 18) {
            if (timeOfDay.equals("Morning")) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (timeOfDay.equals("Afternoon")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        } else if (degrees > 18 && degrees <= 24) {
            if (timeOfDay.equals("Morning")) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (timeOfDay.equals("Afternoon")) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        } else {
            if (timeOfDay.equals("Morning")) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if (timeOfDay.equals("Afternoon")) {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            } else {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.\n", degrees, outfit, shoes);
    }
    // 25. New House
    public static void calculateFlowerCost(String flower, int count, int budget) {
        double pricePerFlower = switch (flower) {
            case "Roses" -> 5.00;
            case "Dahlias" -> 3.80;
            case "Tulips" -> 2.80;
            case "Narcissus" -> 3.00;
            case "Gladiolus" -> 2.50;
            default -> 0;
        };
        double totalCost = count * pricePerFlower;
        if (flower.equals("Roses") && count > 80) {
            totalCost *= 0.90;
        } else if (flower.equals("Dahlias") && count > 90) {
            totalCost *= 0.85;
        } else if (flower.equals("Tulips") && count > 80) {
            totalCost *= 0.85;
        } else if (flower.equals("Narcissus") && count < 120) {
            totalCost *= 1.15;
        } else if (flower.equals("Gladiolus") && count < 80) {
            totalCost *= 1.20;
        }
        double difference = Math.abs(budget - totalCost);
        if (budget >= totalCost) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.\n", count, flower, difference);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.\n", difference);
        }
    }
    // 26. On Time for the Exam
    public static void checkExamArrival(int examHour, int examMinute, int arrivalHour, int arrivalMinute) {
        int examTime = examHour * 60 + examMinute;
        int arrivalTime = arrivalHour * 60 + arrivalMinute;
        int difference = arrivalTime - examTime;

        if (difference < -30) {
            System.out.println("Early");
            int hoursEarly = Math.abs(difference) / 60;
            int minutesEarly = Math.abs(difference) % 60;
            if (hoursEarly > 0) {
                System.out.printf("%d:%02d hours before the start\n", hoursEarly, minutesEarly);
            } else {
                System.out.printf("%d minutes before the start\n", minutesEarly);
            }
        } else if (difference <= 0) {
            System.out.println("On time");
            if (difference < 0) {
                System.out.printf("%d minutes before the start\n", Math.abs(difference));
            }
        } else {
            System.out.println("Late");
            int hoursLate = difference / 60;
            int minutesLate = difference % 60;
            if (hoursLate > 0) {
                System.out.printf("%d:%02d hours after the start\n", hoursLate, minutesLate);
            } else {
                System.out.printf("%d minutes after the start\n", minutesLate);
            }
        }
    }
    // 27. Hotel Room
    public static void calculateHotelCost(String month, int nights) {
        double studioPrice = 0;
        double apartmentPrice = 0;
        switch (month) {
            case "May", "October" -> {
                studioPrice = 50.00;
                apartmentPrice = 65.00;
                if (nights > 7 && nights <= 14) {
                    studioPrice *= 0.95;
                } else if (nights > 14) {
                    studioPrice *= 0.70;
                }
            }
            case "June", "September" -> {
                studioPrice = 75.20;
                apartmentPrice = 68.70;
                if (nights > 14) {
                    studioPrice *= 0.80;
                }
            }
            case "July", "August" -> {
                studioPrice = 76.00;
                apartmentPrice = 77.00;
            }
        }
        if (nights > 14) {
            apartmentPrice *= 0.90;
        }
        System.out.printf("Apartment: %.2f lv.\n", apartmentPrice * nights);
        System.out.printf("Studio: %.2f lv.\n", studioPrice * nights);
    }
    // 28. Climate Zone Identifier
    public static void identifyClimateZone(double latitude, char hemisphere) {
        String zone = "";
        if (latitude > 66.5 || latitude < -66.5) {
            zone = "Arctic Zone";
        } else if (latitude >= 23.5 || latitude <= -23.5) {
            zone = "Temperate Zone";
        } else if (latitude > 0 || latitude < 0) {
            zone = "Tropic Zone";
        } else {
            zone = "Equator";
        }
        System.out.println(zone);
    }
    // 29. Architectural Era Identifier
    public static void identifyArchitecturalEra(int year, String material) {
        String era = "";
        if (year < 500 && material.equals("stone")) {
            era = "Ancient";
        } else if (year >= 500 && year <= 1500 && material.equals("stone")) {
            era = "Medieval";
        } else if (year > 1500 && year <= 1800 && material.equals("wood")) {
            era = "Colonial";
        } else if (year > 1800 && year <= 1900 && material.equals("steel")) {
            era = "Industrial";
        } else if (year > 1900 && material.equals("steel")) {
            era = "Modern";
        } else {
            era = "Uncertain";
        }
        System.out.println(era);
    }

}