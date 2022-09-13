import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 12, 23, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("one", "four", "one", "three", "three", "four", "one"));
        taskOne(nums);
        taskTwo(nums);
        taskThree(words);
        taskFour(words);
    }

    //Задание 1
    public static void taskOne(List<Integer> arrayList) {
        List<Integer> taskOne = new ArrayList<>();
        for (Integer num : arrayList) {
            if (num % 2 == 1) {
                taskOne.add(num);
            }
        }
        System.out.println(taskOne);
    }

    //Задание 2
    public static void taskTwo(List<Integer> arrayList) {
        Set<Integer> taskTwo = new TreeSet<>();
        for (Integer num : arrayList) {
            if (num % 2 == 0) {
                taskTwo.add(num);
            }
        }
        System.out.println(taskTwo);
    }

    //Задание 3
    public static void taskThree(List<String> arrayList) {
        Set<String> taskThree = new HashSet<>(arrayList);
        System.out.println(taskThree);
    }

    //Задание 4
    public static void taskFour(List<String> arrayList) {
        HashMap<String, Integer> taskFour = new HashMap<>();
        for (String word : arrayList) {
            if (Collections.frequency(arrayList, word) > 1) {
                taskFour.put(word, Collections.frequency(arrayList, word));
            }
        }
        System.out.println(taskFour.values());
    }
}