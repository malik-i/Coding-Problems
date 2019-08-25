import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/single-row-keyboard/

public class singleRowKeyboard {
    public static void main(String[] args){
        System.out.println("SRK workinh");
        System.out.println(calculateTime("abcdefghijklmnopqrstuvwxyz", "cba"));
    }

    public static int calculateTime(String keyboard, String word) {
        Map keyMap = new HashMap<>();
        char [] wordChar = word.toCharArray();
        for(int i = 0; i < keyboard.length(); i++){
            keyMap.put(keyboard.charAt(i), i);
        }
        int total = (int)keyMap.get(wordChar[0]);

        for(int i = 1; i<word.length(); i++){
            total += Math.abs(((int)keyMap.get(word.charAt(i)) - (int)keyMap.get(word.charAt(i-1))));
        }
        return total;
    }


}