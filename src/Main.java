import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 12, 23, 4, 4, 5, 5, 6, 7));
//Задание 1
        List<Integer> taskOne = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 == 1) {
                taskOne.add(num);
            }
        }
        System.out.println(taskOne);
//Задание 2
        Set<Integer> taskTwo = new TreeSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                taskTwo.add(num);
            }
        }
        System.out.println(taskTwo);
//Задание 3
        List<String> words = new ArrayList<>(List.of("one", "four", "one", "three", "three", "four", "one"));
        Set<String> taskThree = new HashSet<>();
        taskThree.addAll(words);
        System.out.println(taskThree);
//Задание 4
        List<Integer> taskFour = new ArrayList<>();
        List<String> sorted = new ArrayList<>();
        for (String word : words) {
            if (!sorted.contains(word)) {
                sorted.add(word);
                if (Collections.frequency(words, word) > 1) {
                    taskFour.add(Collections.frequency(words, word));
                }
            }
        }
        System.out.println(taskFour);
    }
}