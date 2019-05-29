// Given a rectangular matrix of characters, add a border of asterisks(*) to it.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class addBorder {
    public static void main(String[] args){
        String[] testCase = {"Meek","Mill"};
        String[] copyBorder = Arrays.copyOf(addBorder(testCase), addBorder(testCase).length);

        for(String s : copyBorder){
            System.out.println(s);
        }
    }

    static String[] addBorder(String[] picture) {
        int dim = picture[0].length();
        List<String> layerList = new ArrayList<>();
        String topBottom = "";
        String layer = "";

        for(int i = 0; i < dim+2; i++){ topBottom += "*"; }

        for(String w : picture){
            layer = "*" + w + "*";
            layerList.add(layer);
        }
        layerList.add(0, topBottom);
        layerList.add(topBottom);

        return layerList.toArray(new String[0]);
    }
}
