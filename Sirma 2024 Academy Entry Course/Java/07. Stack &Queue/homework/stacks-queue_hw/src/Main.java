import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // Task 1: Reverse Numbers Stack
    public class ReverseNumbersStack {
        public static void reverseNumbers() {
            Scanner scanner = new Scanner(System.in);
            ArrayDeque<Integer> stack = new ArrayDeque<>();

            for (String num : scanner.nextLine().split(" ")) {
                stack.push(Integer.parseInt(num));
            }

            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
        }
    }

    // Task 2: Basic Stack Operations
    public class BasicStackOperations {
        public static void basicStackOps() {
            Scanner scanner = new Scanner(System.in);
            int[] input = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            int n = input[0], s = input[1], x = input[2];

            ArrayDeque<Integer> stack = new ArrayDeque<>();
            Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .limit(n) // Push only N elements
                    .forEach(stack::push);
            for (int i = 0; i < s && !stack.isEmpty(); i++) {
                stack.pop();
            }
            if (stack.contains(x)) {
                System.out.println("true");
            } else if (!stack.isEmpty()) {
                System.out.println(stack.stream().min(Integer::compare).orElse(0));
            } else {
                System.out.println(0);
            }
        }
    }

    // Task 3: Browser
    public class Browser {
        public static void browserNavigation() {
            Scanner scanner = new Scanner(System.in);
            ArrayDeque<String> history = new ArrayDeque<>();
            String currentUrl = "";

            String input;
            while (!"Home".equals(input = scanner.nextLine())) {
                if ("back".equals(input)) {
                    if (history.isEmpty()) {
                        System.out.println("no previous URLs");
                    } else {
                        currentUrl = history.pop();
                    }
                } else {
                    if (!currentUrl.isEmpty()) {
                        history.push(currentUrl);
                    }
                    currentUrl = input;
                }
                System.out.println(currentUrl);
            }
        }
    }

    // Task 4: Simple Calculator
    public class SimpleCalculator {
        public static void simpleCalculator() {
            Scanner scanner = new Scanner(System.in);
            String[] tokens = scanner.nextLine().split(" ");
            ArrayDeque<Integer> stack = new ArrayDeque<>();

            int result = Integer.parseInt(tokens[0]);
            for (int i = 1; i < tokens.length; i += 2) {
                String operator = tokens[i];
                int operand = Integer.parseInt(tokens[i + 1]);

                if ("+".equals(operator)) {
                    result += operand;
                } else if ("-".equals(operator)) {
                    result -= operand;
                }
            }
            System.out.println(result);
        }
    }

    // Task 5: Decimal to Binary Converter
    public class DecimalToBinaryConverter {
        public static void decimalToBinary() {
            Scanner scanner = new Scanner(System.in);
            int decimal = scanner.nextInt();
            ArrayDeque<Integer> stack = new ArrayDeque<>();

            if (decimal == 0) {
                System.out.println(0);
            } else {
                while (decimal > 0) {
                    stack.push(decimal % 2);
                    decimal /= 2;
                }
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
            }
        }
    }

    // Task 6: Matching Brackets
    public class MatchingBrackets {
        public static void matchBrackets() {
            Scanner scanner = new Scanner(System.in);
            String expression = scanner.nextLine();
            ArrayDeque<Integer> stack = new ArrayDeque<>();

            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);
                if (ch == '(') {
                    stack.push(i);
                } else if (ch == ')') {
                    int startIndex = stack.pop();
                    String subExpression = expression.substring(startIndex, i + 1);
                    System.out.println(subExpression);
                }
            }
        }
    }

    // Task 7: Printer Queue
    public class PrinterQueue {
        public static void printerQueue() {
            Scanner scanner = new Scanner(System.in);
            ArrayDeque<String> queue = new ArrayDeque<>();

            String input;
            while (!"print".equals(input = scanner.nextLine())) {
                if ("cancel".equals(input)) {
                    if (queue.isEmpty()) {
                        System.out.println("Printer is on standby");
                    } else {
                        System.out.println("Canceled " + queue.poll());
                    }
                } else {
                    queue.offer(input);
                }
            }

            for (String file : queue) {
                System.out.println(file);
            }
        }
    }

    // Task 8: Balanced Parentheses
    public class BalancedParentheses {
        public static void balancedParentheses() {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            ArrayDeque<Character> stack = new ArrayDeque<>();
            boolean isBalanced = true;

            for (char ch : input.toCharArray()) {
                if (ch == '(' || ch == '[' || ch == '{') {
                    stack.push(ch);
                } else if (ch == ')' || ch == ']' || ch == '}') {
                    if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
                        isBalanced = false;
                        break;
                    }
                }
            }
            System.out.println(isBalanced && stack.isEmpty());
        }

        private static boolean isMatchingPair(char open, char close) {
            return (open == '(' && close == ')') ||
                    (open == '[' && close == ']') ||
                    (open == '{' && close == '}');
        }
    }

    // Task 9: Hot Potato
    public class HotPotato {
        public static void hotPotato() {
            Scanner scanner = new Scanner(System.in);
            String[] names = scanner.nextLine().split(" ");
            int n = Integer.parseInt(scanner.nextLine());

            ArrayDeque<String> queue = new ArrayDeque<>();
            Collections.addAll(queue, names);

            while (queue.size() > 1) {
                for (int i = 1; i < n; i++) {
                    queue.offer(queue.poll());
                }
                System.out.println("Removed " + queue.poll());
            }

            System.out.println("Last is " + queue.poll());
        }
    }

    // Task 10: Maximum Element
    public class MaximumElement {
        public static void maximumElement() {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            ArrayDeque<Integer> stack = new ArrayDeque<>();
            ArrayDeque<Integer> maxStack = new ArrayDeque<>();

            for (int i = 0; i < n; i++) {
                String[] command = scanner.nextLine().split(" ");
                int type = Integer.parseInt(command[0]);

                if (type == 1) {
                    int x = Integer.parseInt(command[1]);
                    stack.push(x);
                    if (maxStack.isEmpty() || x >= maxStack.peek()) {
                        maxStack.push(x);
                    }
                } else if (type == 2) {
                    int removed = stack.pop();
                    if (removed == maxStack.peek()) {
                        maxStack.pop();
                    }
                } else if (type == 3) {
                    System.out.println(maxStack.peek());
                }
            }
        }
    }

    // Task 11: Basic Queue Operations
    public class BasicQueueOperations {
        public static void basicQueueOps() {
            Scanner sc_ = new Scanner(System.in);
            int[] input = Arrays.stream(sc_.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            int n = input[0], s = input[1], x = input[2];

            ArrayDeque<Integer> queue = new ArrayDeque<>();
            Arrays.stream(sc_.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .limit(n)
                    .forEach(queue::offer);

            for (int i = 0; i < s && !queue.isEmpty(); i++) {
                queue.poll();
            }

            if (queue.contains(x)) {
                System.out.println("true");
            } else if (!queue.isEmpty()) {
                System.out.println(queue.stream().min(Integer::compare).orElse(0));
            } else {
                System.out.println(0);
            }
        }
    }

    // Task 12: Task Scheduler
    public class TaskScheduler {
        public static void taskScheduler() {
            Scanner scanner = new Scanner(System.in);
            PriorityQueue<Task> tasks = new PriorityQueue<>();

            String input;
            while (!"End".equals(input = scanner.nextLine())) {
                String[] parts = input.split(" ");
                if ("Add".equals(parts[0])) {
                    String name = parts[1];
                    int priority = Integer.parseInt(parts[2]);
                    tasks.offer(new Task(name, priority));
                } else if ("getNextTask".equals(parts[0])) {
                    if (!tasks.isEmpty()) {
                        Task nextTask = tasks.poll();
                        System.out.println(nextTask.name + " - " + nextTask.priority);
                    }
                }
            }
        }

        static class Task implements Comparable<Task> {
            String name;
            int priority;

            public Task(String name, int priority) {
                this.name = name;
                this.priority = priority;
            }

            @Override
            public int compareTo(Task other) {
                return Integer.compare(other.priority, this.priority);
            }
        }
    }

    // Task 13: Document Editor
    public class DocumentEditor {
        public static void documentEditor() {
            Scanner scanner = new Scanner(System.in);
            ArrayDeque<String> text = new ArrayDeque<>();
            ArrayDeque<String> undoStack = new ArrayDeque<>();

            String input;
            while (!"End".equals(input = scanner.nextLine())) {
                String[] parts = input.split(" ");
                String command = parts[0];

                if ("Insert".equals(command)) {
                    String content = parts[1].substring(1, parts[1].length() - 1); // Remove quotes
                    text.push(content);
                    undoStack.clear(); // Clear redo stack on new insert
                } else if ("Undo".equals(command)) {
                    if (!text.isEmpty()) {
                        undoStack.push(text.pop());
                    }
                } else if ("Redo".equals(command)) {
                    if (!undoStack.isEmpty()) {
                        text.push(undoStack.pop());
                    }
                }
            }

            System.out.println(String.join("", text));
        }
    }

    // Task 14: Recursive Fibonacci
    public class RecursiveFibonacci {
        public static void recursiveFibonacci() {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            System.out.println(getFibonacci(n));
        }

        private static long getFibonacci(int n) {
            if (n <= 1) {
                return n;
            }
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }

    // Task 15: Factorio
    public class Factorio {
        public static void factorio() {
            Scanner scanner = new Scanner(System.in);
            String[] robotData = scanner.nextLine().split("\\|");
            LocalTime startTime = LocalTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("HH:mm:ss"));

            HashMap<String, Integer> robotProcessingTimes = new HashMap<>();
            HashMap<String, LocalTime> robotAvailableTimes = new HashMap<>();
            for (String data : robotData) {
                String[] parts = data.split("-");
                String robotName = parts[0];
                int processingTime = Integer.parseInt(parts[1]);
                robotProcessingTimes.put(robotName, processingTime);
                robotAvailableTimes.put(robotName, startTime); // Initially available at start time
            }

            ArrayDeque<String> products = new ArrayDeque<>();
            String product;
            while (!"End".equals(product = scanner.nextLine())) {
                products.offer(product);
            }

            while (!products.isEmpty()) {
                String nextProduct = products.poll();
                boolean productProcessed = false;

                for (String robotName : robotAvailableTimes.keySet()) {
                    LocalTime availableTime = robotAvailableTimes.get(robotName);
                    if (availableTime.isBefore(startTime) || availableTime.equals(startTime)) {
                        int processingTime = robotProcessingTimes.get(robotName);
                        LocalTime endTime = availableTime.plusSeconds(processingTime);
                        robotAvailableTimes.put(robotName, endTime);
                        System.out.println(robotName + " - " + nextProduct + " [" + availableTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")) + "]");
                        productProcessed = true;
                        break;
                    }
                }

                if (!productProcessed) {
                    products.offer(nextProduct);
                }

                startTime = startTime.plusSeconds(1); 
            }
        }
    }

}