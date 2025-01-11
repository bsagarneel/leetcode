import java.util.Map;
import java.util.HashMap;

public class RomanToInteger_alternate {
    public static int RomanToInteger(String s){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for(int i=0; i<s.length()-1; i++){
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                result -=map.get(s.charAt(i));
            }
            else{
                result +=map.get(s.charAt(i));
            }
        }
        return result+map.get(s.charAt(s.length()-1)); // Last character of the string was not the part of the loop and hence to add with the result 
    }
    public static void main(String[] args) {
        System.out.println("num: "+RomanToInteger("LVIII")); //50+5+3
    }
}
