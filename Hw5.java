package Pro_JAVA_HW;

import java.util.Arrays;
import java.util.HashSet;
//Метод, возвращающий новый массив с уникальными значениями:
public class Hw5 {
    public static int[] getUniqueValues(int[] array){
        HashSet<Integer> uniqueSet = new HashSet<>();
        for (int num : array){
            uniqueSet.add(num);
        }
        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        for ( int num: uniqueSet){
            uniqueArray[index++] =num;
        }
        return uniqueArray;
    }

    public static void main(String[] args) {
        int[] array = {1,2,2,3,3,4,4,5};
        int[] uniqueArray = getUniqueValues(array);
        System.out.println(Arrays.toString(uniqueArray));
    }
}
