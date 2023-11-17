import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        System.out.println("Задание 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> numsSorted = new ArrayList<>();
        for (int num : nums) {
            if (num % 2 != 0) {
                numsSorted.add(num);
            }
        }
        System.out.println(numsSorted);
    }

    private static void task2() {
        System.out.println("Задание 2");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> numsSorted = new ArrayList<>();
        for (int num : nums) {
            if (num % 2 == 0 && !numsSorted.contains(num)) {
                numsSorted.add(num);
            }
        }
        Collections.sort(numsSorted);
        System.out.println(numsSorted);
    }

    private static void task3() {
        System.out.println("Задание 3");
        List<String> words = new ArrayList<>(List.of("Жаба", "Жаба", "Выдра", "Слон", "Слон", "Олень", "Олень", "Кенгуру", "Кенгуру", "Лев"));
        Set<String> wordsSorted = new HashSet<>(words);
        System.out.println(wordsSorted);
    }

    private static void task4() {
        System.out.println("Задание 4");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Set<String> stringsSorted = new HashSet<>(strings);
        int i = 0;
        for (String stringSorted : stringsSorted) {
            for (String string : strings) {
                if (stringSorted.equals(string)) {
                    i++;
                }
            }
            System.out.println(i);
            i = 0;
        }
    }
}