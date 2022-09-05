import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 12, 23, 4, 4, 5, 5, 6, 7));
//Задание 1
        List<Integer> taskOne = new ArrayList<>(1);
        for (Integer num : nums) {
            if (num % 2 == 1) {
                taskOne.add(num);
            }
        }
        System.out.println(taskOne);
//Задание 2
        List<Integer> taskTwo = new ArrayList<>(1);
        for (Integer num : nums) {
            if (num % 2 == 0 && !taskTwo.contains(num)) {
                taskTwo.add(num);
            }
        }
        Collections.sort(taskTwo);
        System.out.println(taskTwo);
//Задание 3
        List<String> words = new ArrayList<>(List.of("one", "four", "one", "three", "three", "four", "one"));
        List<String> taskThree = new ArrayList<>(1);
        for (String word : words) {
            if (!taskThree.contains(word)) {
                taskThree.add(word);
            }
        }
        System.out.println(taskThree);
//Задание 4
        List<Integer> taskFour = new ArrayList<>(1);
        List<String> sorted = new ArrayList<>(1);
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