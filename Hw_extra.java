package Pro_JAVA_HW;

import java.util.*;

public class Hw_extra {
    public static void main(String[] args) {
        // Создаем и заполняем мапу

        Map<String, Integer> map = new HashMap<>();
        map.put("Mercedes", 1);
        map.put("BMW", 2);
        map.put("Lexus", 3);
        map.put("Toyota", 4);
        map.put("Tesla", 5);

        // Выводим все ключи на экран
        System.out.println("Ключи в мапе:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // Проверяем, содержит ли мапа определенное значение
        int valueToCheck = 3;
        boolean containsValue = map.containsValue(valueToCheck);
        System.out.println("Мапа содержит значение " + valueToCheck + ": " + containsValue);

        // Находим ключ, связанный с определенным значением
        int valueToFind = 4;
        String keyWithValue = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == valueToFind) {
                keyWithValue = entry.getKey();
                break;
            }
        }
        System.out.println("Ключ со значением " + valueToFind + ": " + keyWithValue);

        // Выводим ключи, у которых значение начинается с определенной буквы
        char startsWithLetter = 'b';
        System.out.println("Ключи, у которых значение начинается с буквы " + startsWithLetter + ":");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().charAt(0) == startsWithLetter) {
                System.out.println(entry.getKey());
            }
        }

        // Проверяем, содержит ли мапа определенный ключ
        String keyToCheck = "cherry";
        boolean containsKey = map.containsKey(keyToCheck);
        System.out.println("Мапа содержит ключ " + keyToCheck + ": " + containsKey);

        // Находим ключ с максимальным значением
        String keyWithMaxValue = null;
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                keyWithMaxValue = entry.getKey();
                maxValue = entry.getValue();
            }
        }
        System.out.println("Ключ с максимальным значением: " + keyWithMaxValue);

        // Подсчитываем количество ключей, значение которых содержит определенное слово
        String wordToCount = "e";
        int keysWithWordCount = 0;
        for (String key : map.keySet()) {
            if (key.contains(wordToCount)) {
                keysWithWordCount++;
            }
        }
        System.out.println("Количество ключей, значение которых содержит слово \"" + wordToCount + "\": " + keysWithWordCount);

        // Находим все ключи, значение которых состоит только из цифр
        System.out.println("Ключи, значение которых состоит только из цифр:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().toString().matches("\\d+")) {
                System.out.println(entry.getKey());
            }
        }

        // Подсчитываем сумму числовых значений в мапе
        int sum = 0;
        for (int value : map.values()) {
            sum += value;
        }
        System.out.println("Сумма числовых значений в мапе: " + sum);

        // Подсчитываем количество ключей, у которых длина значения превышает определенную границу
        int valueLengthThreshold = 2;
        int keysWithValueLengthExceedingThreshold = 0;
        for (String key : map.keySet()) {
            if (String.valueOf(map.get(key)).length() > valueLengthThreshold) {
                keysWithValueLengthExceedingThreshold++;
            }
        }
        System.out.println("Количество ключей, у которых длина значения превышает " + valueLengthThreshold + ": " + keysWithValueLengthExceedingThreshold);

        // Создаем новую мапу, где значениями будут ключи, а ключами - значения исходной мапы
        Map<Integer, String> reversedMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            reversedMap.put(entry.getValue(), entry.getKey());
        }
        System.out.println("Обратная мапа:");
        for (Map.Entry<Integer, String> entry : reversedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Очищаем мапу и выводим сообщение о ее пустом состоянии
        map.clear();
        System.out.println("Мапа очищена: " + map.isEmpty());

        // Создаем список List, заполняем его несколькими значениями и выводим на экран каждый элемент списка
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");
        list.add("elderberry");

        System.out.println("Элементы списка:");
        for (String item : list) {
            System.out.println(item);
        }

        // Создаем список List, заполняем его несколькими значениями и выводим на экран каждый элемент списка
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);

        System.out.println("Элементы списка:");
        for (int number : numberList) {
            System.out.println(number);
        }

        // Создаем список List, заполняем его несколькими значениями, перебираем список и выводим элементы в обратном порядке
        List<String> reverseList = new ArrayList<>();
        reverseList.add("apple");
        reverseList.add("banana");
        reverseList.add("cherry");
        reverseList.add("date");
        reverseList.add("elderberry");

        System.out.println("Элементы списка в обратном порядке:");
        for (int i = reverseList.size() - 1; i >= 0; i--) {
            System.out.println(reverseList.get(i));
        }

        // Вычисляем сумму всех элементов в массиве int[] и выводим результат
        int[] array = {1, 2, 3, 4, 5};
        int arraySum = 0;
        for (int element : array) {
            arraySum += element;
        }
        System.out.println("Сумма всех элементов в массиве: " + arraySum);

        // Находим наименьший и наибольший элементы в массиве int[] и выводим их
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Наименьший элемент: " + min);
        System.out.println("Наибольший элемент: " + max);

        // Подсчитываем количество четных элементов в массиве int[] и выводим результат
        int evenCount = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Количество четных элементов: " + evenCount);

        // Сортируем массив int[] в порядке убывания и выводим отсортированный массив
        Arrays.sort(array);
        System.out.println("Массив в порядке убывания:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        // Подсчитываем сумму квадратов всех элементов в массиве int[] и выводим результат
        int squareSum = 0;
        for (int element : array) {
            squareSum += element * element;
        }
        System.out.println("Сумма квадратов всех элементов в массиве: " + squareSum);
    }
}
