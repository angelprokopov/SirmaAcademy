import java.util.*;

public class Main {
    public void main(String[] args) {
        // 5. Generic Box of Integer
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            Box<Integer> box = new Box<>(value);
            System.out.println(box);
        }

        // 7. Generic Swap Method Integers
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(s.nextInt());
        }
        int i = s.nextInt();
        int j = s.nextInt();
        ListUtils.swap(list, i, j);
        for (Integer integer : list) {
            System.out.println(integer.getClass().getName() + ": " + integer);
        }

        // 9. Generic Count Method Doubles
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        List<Box_<Double>> list1 = new ArrayList<>();
        for (int x = 0; x < num1; x++) {
            list1.add(new Box_<>(sc1.nextDouble()));
        }
        Double el = sc1.nextDouble();
        int count = Box_.countGreaterThan(list, new Box_<>(el).getValue());
        System.out.println(count);
    }

    // 1. Jar of T
    public class Jar<T> {
        private Deque<T> elements;

        public Jar() {
            elements = new ArrayDeque<T>();
        }

        public void add(T element) {
            elements.push(element);
        }

        public T remove() {
            return elements.pop();
        }
    }

    // 2. Generic Array Creator
    public class ArrayCreator {
        public static <T> T[] createArray(int length, T item) {
            T[] array = (T[]) new Object[length];
            for (int i = 0; i < length; i++) {
                array[i] = item;
            }
            return array;
        }

        public static <T> T[] createArray(Class<T> clas, int length, T items) {
            T[] array = (T[]) new Object[length];
            for (int i = 0; i < length; i++) {
                array[i] = items;
            }
            return array;
        }
    }

    // 3. Generic Scale
    public class Scale<T extends Comparable<T>> {
        private T left;
        private T right;

        public Scale(T left, T right) {
            this.left = left;
            this.right = right;
        }

        public T getHeavier() {
            if (left.compareTo(right) > 0) {
                return left;
            } else if (right.compareTo(left) > 0) {
                return right;
            }
            return null;
        }
    }

    // 4. Generic Box
    public class Box<T> {
        private T value;

        public Box(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value.getClass().getName() + ": " + value;
        }
    }

    // 6. Generic Swap Method Strings
    public class ListUtils {
        public static <T> void swap(List<T> list, int i, int j) {
            Collections.swap(list, i, j);
        }
    }

    // 8. Generic Count Method Strings
    public class Box_<T extends Comparable<T>> {
        private T value;

        public Box_(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public static <T extends Comparable<T>> int countGreaterThan(List<T> list, T element) {
            int count = 0;
            for (T item : list) {
                if (item.compareTo(element) > 0) {
                    count++;
                }
            }
            return count;
        }

        @Override
        public String toString() {
            return value.getClass().getName() + ": " + value;
        }
    }

    // 10. Custom List
    public class CustomLIst<T extends Comparable<T>> {
        private List<T> list;

        public CustomLIst() {
            list = new ArrayList<>();
        }

        public void add(T element) {
            list.add(element);
        }

        public T remove(int index) {
            return list.remove(index);
        }

        public boolean contains(T element) {
            return list.contains(element);
        }

        public void swap(int index1, int index2) {
            Collections.swap(list, index1, index2);
        }

        public int countGreaterThan(T element) {
            return (int) list.stream().filter(e -> e.compareTo(element) > 0).count();
        }

        public T getMax() {
            return Collections.max(list);
        }

        public T getMin() {
            return Collections.min(list);
        }

        public void print() {
            list.forEach(System.out::println);
        }
    }
}