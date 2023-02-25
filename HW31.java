//1. Пусть дан произвольный список целых чисел, удалить из него четные числа
package HW3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class HW31 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> rndlist = new ArrayList<Integer>(20);
        ArrayList<Integer> resultlist = new ArrayList<Integer>(20);
        // создание массива случайных элеметов
        for (int i = 0; i <= 20; i++) {
            rndlist.add(rnd.nextInt(100));
        }
        System.out.println(rndlist.toString());
        // удаление четных элементов
        // создание нового массива только из четных элементов
        for (Iterator<Integer> iterator = rndlist.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            } else {
                resultlist.add(number);
            }
        }
        System.out.println(rndlist.toString());
        System.out.println(resultlist.toString());
    }
}
