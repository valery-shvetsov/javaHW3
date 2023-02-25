//2. Задан целочисленный список ArrayList. 
//Найти минимальное, максимальное и среднее арифметическое из этого списка.

package HW3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class HW32 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> sourcarray = new ArrayList<Integer>(20);
        // создание массива случайных элеметов
        for (int i = 0; i <= 20; i++) {
            sourcarray.add(rnd.nextInt(100));
        }
        System.out.println(sourcarray.toString());
        Collections.sort(sourcarray);
        System.out.println(sourcarray.toString());
        int min = sourcarray.get(0);
        int max = sourcarray.get(sourcarray.size() - 1);
        double sum = 0;
        for (int i = 0; i < sourcarray.size(); i++) {
            sum += sourcarray.get(i);
        }
        double arithmean = sum / sourcarray.size();
        System.out.printf("минимальный элемент %s", min);
        System.out.println();
        System.out.printf("максимальный элемент %s", max);
        System.out.println();
        System.out.printf("среднее арифметическое из этого списка %s", arithmean);
        String result = String.format("%.3f",arithmean);
        System.out.println();
        System.out.printf("среднее арифметическое округляем до %s", result);
    }
}
