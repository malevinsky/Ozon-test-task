import java.util.*;

/**
 *  created by malevinsky
 *  email: malevinskaya2000@gmail.com
 *  telegram: @theos_deus
 *  date: 16.02.2021
 */

public class Dublicates {
    public static void main(String[] args) {
        long[] arr = {1, 23, 45, 34, 34, 4, 1, 1}; //напишу main, чтобы код можно было сразу протестить.
        distinct(arr);
        distinct_set(arr);
    }

    public static void distinct(long[] arr) {
        System.out.println("Изначальный массив: " + Arrays.toString(arr));
        arr = Arrays.stream(arr) //Создаём стрим из массива
                .distinct() //убираем все дубликаты из стрима
                .toArray(); //возвращаем значения стрима в виде массива
        System.out.println("Ответ: " + Arrays.toString(arr)
                .replace("[","")
                .replace("]",""));
    }

    public static void distinct_set(long[] arr) {
        Set<Long> a = new HashSet<>();
        for (long l : arr) {
            a.add(l);
        }
        System.out.println(a);
    }

}