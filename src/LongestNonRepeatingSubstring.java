import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingSubstring {

    public static int getLongestNonRepeatingSubstring(String inputStr){

        char[] arr = inputStr.toCharArray();
        int maxLength = 0;
        String subString = "";
        if(inputStr.length() == 1){
            return 1;
        }
        for(int i = 0; i < inputStr.length() - 1 ; i++){
            for(int j = inputStr.length(); j > 0 ; j--){
                if(i == j) break;
                char[] subArr = Arrays.copyOfRange(arr,i, j);
                Set<Character> subArrSet = new HashSet<>();
                for(char c: subArr){
                    subArrSet.add(c);
                }
                if(subArrSet.size() == subArr.length && subArr.length > maxLength){
                    maxLength = subArr.length;
                    subString = new String(subArr);
                    break;
                }
            }
        }
        System.out.println(subString);
        return maxLength;
    }

    public static void main(String[] args){
        int ml = getLongestNonRepeatingSubstring("au");
        System.out.println(ml);
    }
}
