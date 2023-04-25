/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
*/

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Генерируем первый массив.
        ArrayList<Integer> array1 = Tools.generator();
        System.out.printf("%s size = %s\n", array1, array1.size());
        // Генерируем второй массив.
        ArrayList<Integer> array2 = Tools.generator();
        System.out.printf("%s size = %s\n", array2, array2.size());
        // Вычисляем третий массив при помощи вычитания второго массива из первого.
        ArrayList<Integer> array3 = Tools.subArr(array1, array2);
        System.out.println(array3);

    }
}

class Tools{
    // Создаем метод для генерации массива.
    public static ArrayList<Integer> generator(){
        Random random = new Random();
        int range = 7 + random.nextInt(2); // Определяем случайную длинну массива от 7 до 8 элементов.
        ArrayList<Integer> array = new ArrayList<>();
        for (int i=0; i<range; i++){
            array.add(random.nextInt(10));
        }
        return array;
    }

    // Создаем метод для поэлементного вычитания массивов равной длинны.
    public static ArrayList<Integer> subArr(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        if (arr1.size() != arr2.size()) { // Бросаем исключение если размеры массивов не равны.
            throw new RuntimeException("Размеры массивов не одинаковы!");
        }
        ArrayList<Integer> resultArr = new ArrayList<>();
        for (int i = 0; i < arr1.size(); i++) {
            resultArr.add(arr1.get(i) - arr2.get(i));
        }
        return resultArr;
    }
}
