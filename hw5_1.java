package Pro_JAVA_HW;
// Метод, проверяющий, содержит ли множество только нечетные числа:
public class hw5_1 {
   public static boolean containOnlyOddNummers(int[] numbers){
       for(int number:numbers){
           if (number % 2==0){
               return false;

           }
       }
       return true;
   }

    public static void main(String[] args) {
        int[] numbers1 = {1,3,5,7,9};
        int [] numbers2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(containOnlyOddNummers(numbers1));
        System.out.println(containOnlyOddNummers(numbers2));
    }
}
