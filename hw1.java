package Pro_JAVA_HW;

public class hw1 {
    public static void main(String[] args) {
        int Array[] = {31, 52, 72, 12,11,32,89};
        int sum = 0;
        for (int i = 0; i < Array.length; i++) {
            sum = sum + Array[i];
        }
        int MaxElement = Array[0];
        for (int i = 0; i < Array.length ; i++) {
            if (Array[i]>MaxElement );{
                MaxElement = Array[i];
            }
        }
        int result = 0;
        for (int i = 0; i < Array.length ; i++) {
            if (Array[i]%2==0){
            result++;}
        }

        System.out.println(sum);
        System.out.println(MaxElement);
        System.out.println(result);
    }
    }
// 1 уровень сложности: Уровень сложности 1 из 10:

// -Найти сумму элементов в заданном одномерном массиве.
// -Найти наибольший элемент в заданном одномерном массиве.
// -Подсчитать количество четных элементов в заданном одномерном массиве.
// Уровень сложности 2 из 10:


