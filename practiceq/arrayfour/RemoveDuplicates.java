package practiceq.arrayfour;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {4,5,4,6,9,5,2};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int n:arr){
            set.add(n);
        }
        System.out.println("Remove Duplicates:"+ set);
    }
}
