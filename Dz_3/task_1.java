package Dz_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task_1 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(integers);
        separationNumbers(integers);
        System.out.println(integers);
    }

    static void separationNumbers(List<Integer> source) {
        List<Integer> separation = new ArrayList<>();
        int i = 0;
        while (i < source.size()) {
            Integer number = source.get(i);
            if (source.get(i) % 2 == 0) {
                separation.add(number);
            } else {
                source.remove(i--);
            }
            i++;
        }
    }
}