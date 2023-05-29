package Pro_JAVA_HW;
import java.util.Arrays;
public class hw3 {


        public static void main(String[] args) {
            int[] array = {7, -2, 3, 0, -5, 2, 1};

            // Сортировка по возрастанию
            Arrays.sort(array);
            System.out.println("Отсортированный массив: " + Arrays.toString(array));

            // Проверка на палиндром
            boolean isPalindrome = true;
            for (int i = 0; i < array.length / 2; i++) {
                if (array[i] != array[array.length - i - 1]) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println("Массив является палиндромом.");
            } else {
                System.out.println("Массив не является палиндромом.");
            }

            // Удаление отрицательных элементов
            int nonNegativeCount = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= 0) {
                    array[nonNegativeCount] = array[i];
                    nonNegativeCount++;
                }
            }
            int[] nonNegativeArray = Arrays.copyOf(array, nonNegativeCount);
            System.out.println("Массив без отрицательных элементов: " + Arrays.toString(nonNegativeArray));
        }
    }


