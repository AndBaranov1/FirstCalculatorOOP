import java.util.Random;

/**
 * Created by 1 on 21.03.2018.
 * Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
 * Найти максимальный отрицательный и минимальный положительный элементы массива.
 * Поменять их местами
 */
public class Task_4 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        System.out.println("Массив из 20 случайных чисел: ");
        //Перебираем массив в цикле и выводим в консоль
        for (int i = 0; i < 20; i++) {
            array[i] = (random.nextInt(20) - 10);
            System.out.println(array[i]);
        }
        int maxIndex = 0;
        int max = -11;
        //Перебираем массив в цикле, если элемент массива больше max и меньше 0, значит это макс. отриц. эл.
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max && array[i] < 0) {
                max = array[i];
                maxIndex = i;
            }
        }
        int minIndex = 0;
        int min = 11;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min && array[j] > 0) {
                min = array[j];
                minIndex = j;
            }
        }
        //Поменяем элементы массива местами
        array[maxIndex] = min;
        array[minIndex] = max;
        System.out.println("Максимальный отрицательный элемент:" + max);
        System.out.println("Минимальный положительный элемент:" + min);
        System.out.println("Меняем местами элементы массива:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}