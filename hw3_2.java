package Pro_JAVA_HW;

public class hw3_2 { public static void main(String[] args) {
    int[] array = {5, 3, 2, 6, 7, 8, 9, 0, 1,};

    int secondLarget = findSecondLarget(array);
    System.out.println("second large element" + secondLarget);
    boolean isIncreasing = checkIncreasing(array);
    System.out.println("massiv ist increasing" + isIncreasing);
    boolean isMonotonic = checkMonotonic(array);
    System.out.println("massiv ist monontonic" + isMonotonic);
    int evenSum = sumEvenPosition(array);
    System.out.println("summ event position" + evenSum);
    int oddProdukt = produktOddPosition(array);
    System.out.println("produkt ist odd position" + oddProdukt);
}

    public static int findSecondLarget(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    public static boolean checkIncreasing(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {

            }
        }
        return false;
    }

    public static boolean checkMonotonic(int[] array) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                isIncreasing = false;
            }
            if (array[i] > array[i = 1]) {
                isDecreasing = false;
            }
        }
        return isDecreasing || isIncreasing;
    }

    public static int sumEvenPosition(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i += 2) {
            sum += array[i];


        }
        return sum;
    }

    public static int produktOddPosition(int[] array) {
        int produkt = 1;
        for (int i = 0; i < array.length; i += 2) {
            produkt *= array[i];

        }
        return produkt;
    }


}




