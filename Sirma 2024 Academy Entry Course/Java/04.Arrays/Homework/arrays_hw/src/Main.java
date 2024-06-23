import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

    }

    // Task 1: Sum First and Last Array Element
    public static int sumFirstAndLast(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        return arr[0] + arr[arr.length - 1];
    }

    // Task 2: Day of Week
    public static String dayOfWeek(int dayNumber) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (dayNumber >= 1 && dayNumber <= 7) {
            return days[dayNumber - 1];
        } else {
            return "Invalid day!";
        }
    }

    // Task 3: Reverse an Array of Numbers
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Task 4: Reverse an Array of Strings
    public static String[] reverseArray(String[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    // Task 5: Sum Even Numbers
    public static int sumEvenNumbers(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    // Task 6: Even and Odd Subtraction
    public static int evenOddSubtraction(int[] arr) {
        int evenSum = 0, oddSum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        return evenSum - oddSum;
    }

    // Task 7: Equal Arrays
    public static void compareArrays(int[] arr1, int[] arr2) {
        if (Arrays.equals(arr1, arr2)) {
            int sum = Arrays.stream(arr1).sum();
            System.out.println("Arrays are identical. Sum: " + sum);
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    System.out.println("Arrays are not identical. Found difference at " + i + " index");
                    return;
                }
            }
        }
    }

    // Task 8: Condense Array to Number
    public static int condenseArrayToNumber(int[] arr) {
        while (arr.length > 1) {
            int[] condensed = new int[arr.length - 1];
            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = arr[i] + arr[i + 1];
            }
            arr = condensed;
        }
        return arr[0];
    }

    // Task 9: Print every N-th Element from an Array
    public static void printEveryNthElement(int[] arr, int n) {
        for (int i = 0; i < arr.length; i += n) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Task 10: Add and Remove Elements from Array
    public static void addAndRemoveElements(String[] commands) {
        List<Integer> numbers = new ArrayList<>();
        int currentNumber = 1;
        for (String command : commands) {
            if (command.equals("add")) {
                numbers.add(currentNumber);
            } else if (command.equals("remove") && !numbers.isEmpty()) {
                numbers.remove(numbers.size() - 1);
            }
            currentNumber++;
        }
        if (numbers.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // Task 11: Rotate Array
    public static int[] rotateArray(int[] arr, int rotations) {
        int[] rotated = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rotated[(i + rotations) % arr.length] = arr[i];
        }
        return rotated;
    }

    // Task 12: Extract a Non-Decreasing Subsequence from an Array
    public static int[] extractNonDecreasingSubsequence(int[] arr) {
        int currentMax = Integer.MIN_VALUE;
        List<Integer> subsequence = new ArrayList<>();
        for (int num : arr) {
            if (num >= currentMax) {
                subsequence.add(num);
                currentMax = num;
            }
        }
        return subsequence.stream().mapToInt(i -> i).toArray();
    }

    // Task 13: Negative / Positive Numbers
    public static int[] rearrangeNumbers(int[] arr) {
        int[] result = new int[arr.length];
        int negativeIndex = 0, positiveIndex = arr.length - 1;
        for (int num : arr) {
            if (num < 0) {
                result[negativeIndex++] = num;
            } else {
                result[positiveIndex--] = num;
            }
        }
        return result;
    }

    // Task 14: First and Last K Numbers
    public static void printFirstAndLastKNumbers(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - k; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Task 15: Last K Numbers Sequence
    public static int[] lastKNumbersSequence(int n, int k) {
        int[] sequence = new int[n];
        sequence[0] = 1;
        for (int i = 1; i < n; i++) {
            int start = Math.max(0, i - k);
            int end = i;
            sequence[i] = Arrays.stream(sequence, start, end).sum();
        }
        return sequence;
    }

    // Task 16: Process Odd Numbers
    public static int[] processOddNumbers(int[] arr) {
        return IntStream.range(0, arr.length)
                .filter(i -> i % 2 != 0)
                .map(i -> arr[i] * 2)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(i -> i)
                .toArray();
    }

    // Task 17: Smallest Two Numbers
    public static void printSmallestTwoNumbers(int[] arr) {
        int[] smallestTwo = Arrays.stream(arr).sorted().limit(2).toArray();
        System.out.println(smallestTwo[0] + " " + smallestTwo[1]);
    }

    // Task 18: List of Products
    public static void listProducts(String[] products) {
        Arrays.sort(products);
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + "." + products[i]);
        }
    }

    // Task 19: Array Manipulations
    public static void arrayManipulations(String initialArray, String[] commands) {
        int[] arr = Arrays.stream(initialArray.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (String command : commands) {
            String[] parts = command.split(" ");
            String action = parts[0];
            int number, index;

            int[] finalArr = arr;
            switch (action) {
                case "Add" -> {
                    number = Integer.parseInt(parts[1]);
                    arr = Arrays.copyOf(arr, arr.length + 1);
                    arr[arr.length - 1] = number;
                }
                case "Remove" -> {
                    number = Integer.parseInt(parts[1]);
                    arr = Arrays.stream(arr)
                            .filter(n -> n != number)
                            .toArray();
                }
                case "RemoveAt" -> {
                    index = Integer.parseInt(parts[1]);
                    arr = IntStream.range(0, arr.length)
                            .filter(i -> i != index)
                            .map(i -> finalArr[i])
                            .toArray();
                }
                case "Insert" -> {
                    number = Integer.parseInt(parts[1]);
                    index = Integer.parseInt(parts[2]);
                    int[] newArr = new int[arr.length + 1];
                    System.arraycopy(arr, 0, newArr, 0, index);
                    newArr[index] = number;
                    System.arraycopy(arr, index, newArr, index + 1, arr.length - index);
                    arr = newArr;
                }
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Task 20: Longest Sequence of Identical Elements
    public static void longestIdenticalSequence(int[] arr) {
        int longestStart = 0, longestLength = 1;
        int currentStart = 0, currentLength = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > longestLength) {
                    longestStart = currentStart;
                    longestLength = currentLength;
                }
                currentStart = i;
                currentLength = 1;
            }
        }
        if (currentLength > longestLength) {
            longestStart = currentStart;
            longestLength = currentLength;
        }
        for (int i = longestStart; i < longestStart + longestLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}