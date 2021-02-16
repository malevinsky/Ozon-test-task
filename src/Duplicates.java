import java.util.*;

/**
 *  created by malevinsky
 *  email: malevinskaya2000@gmail.com
 *  telegram: @theos_deus
 *  date: 16.02.2021
 */

public class Duplicates {
    public static void main(String[] args) {
        long[] arr = {1, 23, 45, 34, 34, 4, 1, 1}; //напишу main, чтобы код можно было сразу протестить.
        distinct(arr);
        distinct_set(arr);
    }

    public static void distinct(long[] arr) {
        arr = Arrays.stream(arr)
                .distinct()
                .toArray();
        System.out.println(Arrays.toString(arr)
                .replace("[","")
                .replace("]",""));
    }

    public static void distinct_set(long[] arr) {
        Set<Long> a = new HashSet<>();
        for (long l : arr) {
            a.add(l);
        }
        System.out.println(a.toString().replaceAll("^\\[|]$", ""));
    }
}