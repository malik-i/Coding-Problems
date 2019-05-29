// Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.
//
// Given two arrays a and b, check whether they are similar.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AreSimilar {
    public static void main(String[] args){
        int[] aTestFail = {1,2,3,4};
        int[] bTestFail = {1,2,3,4,5};
        System.out.println("Should Fail: " + areSimilar(aTestFail,bTestFail));

        int[] aTestPass = {1,2,3};
        int[] bTestPass = {2,1,3};
        System.out.println("Should Pass: " + areSimilar(aTestPass,bTestPass));


    }


    public static boolean areSimilar(int[] a, int[] b) {
        if(a.length != b.length){return false;}
        int[] copyA = Arrays.copyOf(a, a.length);
        int[] copyB = Arrays.copyOf(b, b.length);
        int swapCount = 0;

        Arrays.sort(copyA); Arrays.sort(copyB);

        if(!Arrays.equals(copyA, copyB)){return false;}

        for(int i = 0; i < a.length; i++){ if(a[i] != b[i]){swapCount++;} }

        return (swapCount == 2 || swapCount == 0);
    }
}
