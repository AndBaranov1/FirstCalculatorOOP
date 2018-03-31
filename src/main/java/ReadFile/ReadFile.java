package ReadFile;

import java.io.*;
import java.util.*;

/**
 * Created by 1 on 27.03.2018.
 * Прочитать слова из файла.
 * Отсортировать в алфавитном порядке.
 * Посчитать сколько раз каждое слово встречается в файле. Вывести статистику на консоль
 * Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
 */
public class ReadFile {
    public static void main(String[] args) throws Exception {
        //Читаем файл
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\1\\IdeaProjects\\Project_calculator\\src\\main\\java\\ReadFile\\inputtextfile.txt"));
        System.out.println("Чтение слов из файла:");
        String str = br.readLine();
        //Выводим строку из файла на консоль
        System.out.println(str);
        //С помощью метода split разбиваем строку на слова
        String[] list = str.split("\\s+");
        //Для подсчета слов которое встречается в файле
        /**
         * Объявляем переменную типа HashMap, которая является расширением класса Map
         * Указываем, что ключ символьный, а значение целое число
         */
        HashMap<String, Integer> countWord = new HashMap<String, Integer>();
        for (String word : list) {
            //Проверяем, если есть такой ключ в коллекции, то прибавляе 1, если нет, то добавляем элемент в коллекцию со значением 1
            if (!countWord.containsKey(word)) {
                countWord.put(word, 0);
            }
            countWord.put(word, countWord.get(word) + 1);
        }
        // Отсортировать в алфавитном порядке.
        List<String> map = new ArrayList<String>(countWord.keySet());
        //Сортируем коллекцию map
        Collections.sort(map);
        System.out.println("Сортировка в алфавитном порядке:");
        //Обходим каждый элемент коллекции и записываем значение в sorting выводя его в консоль
        for (String sorting : map)
            System.out.println(sorting);
        //Посчитать сколько раз каждое слово встречается в файле. Вывести статистику на консоль
        System.out.println("Повтор слов:");
        for (String word : countWord.keySet()) {
            System.out.println(word + " " + countWord.get(word));
        }
        //Найти слово с максимальным количеством повторений.
        //В maxRepeat слово с максимальным количеством повторений
        HashMap.Entry<String, Integer> maxRepeat = null;
        //Обходим каждый элемент коллекции countWord
        for (HashMap.Entry<String, Integer> entry : countWord.entrySet()) {
            //Если максимальное значение не определено или очередное значение ещё больше
            if (maxRepeat == null || entry.getValue().compareTo(maxRepeat.getValue()) > 0) {
                //то присвоить максимому новое значение
                maxRepeat = entry;
            }
        }
        System.out.println("Слово с максимальным количеством повторений:");
        System.out.println(maxRepeat);
    }
}