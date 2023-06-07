package Pro_JAVA_HW;

import java.util.HashSet;

public class hw5_2 {
    public static HashSet<Integer> getUnionSets(HashSet<Integer> set1, HashSet<Integer> set2){
        HashSet<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        HashSet<Integer> unionSet =getUnionSets(set1,set2);
        System.out.println(unionSet);
    }
}
