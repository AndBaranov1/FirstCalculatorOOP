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
        int max = 0;
        int min = 0;
        for (int i = 0; i < 20; i++) {
            array[i] = (random.nextInt(20) - 10);
            System.out.println(array[i]);
            if (i == 0) {
                min = array[0];
                max = array[0];
            } else {
                if (max < array[i]) max = array[i];
                if (min > array[i]) min = array[i];
            }
        }
        System.out.println("Максимальный отрицательный элемент:" + max);
        System.out.println("Минимальный положительный элемент:" + min);
    }
}
