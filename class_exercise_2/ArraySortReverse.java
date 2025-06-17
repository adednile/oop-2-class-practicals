package class_exercise_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortReverse {
    public static void main(String[] args) {
        String[] pallets = {"B234", "A987", "C765", "R876", "N396", "Y098", "Z736", "W135", "P208"};

        System.out.println("Sorted ........");

        Arrays.sort(pallets);
        
        for (String pallet : pallets) {
            System.out.println("---" + pallet);
        }

        System.out.println("\nReversed ..........");
        List<String> palletList = Arrays.asList(pallets);
        Collections.reverse(palletList);
        for (String pallet : palletList) {
            System.out.println("----"  + pallet);
        }
    }  
}
