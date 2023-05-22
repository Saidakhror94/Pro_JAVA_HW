package Pro_JAVA_HW;

public class hw2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 2, 1};
        int product = 1;
        boolean Sym = true;
        int length = array.length;

        for (int i = 0; i < length / 2; i++) {
            if (array[i] != array[length - i - 1]) {
                Sym = false;
                break;
            }
        }

        for (int i = 0; i < array.length; i++) {
            product *= array[i];
            System.out.println("proizvedenie produkta" + product);

            if (Sym) {
                System.out.println("Массив является симметричным.");
            } else {
                System.out.println("Массив не является симметричным.");
            }


        }
    }
}










