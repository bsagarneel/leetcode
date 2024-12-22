import java.util.Arrays;

public class LongestCommonPrefix {

    static String longestCommonPrefix(String []arr){
        Arrays.sort(arr);
        String prefix = "";
        if(arr!=null && arr.length>0){
            prefix = arr[0];
            for(int i=1;i<arr.length;i++){
                while(!arr[i].startsWith(prefix)){
                    prefix=prefix.substring(0,prefix.length()-1);
                }
            }
            return prefix;
        }
    return prefix;    
    }

    public static void main(String [] args){
        String arr [] ={"geksforgeeks", "geeks", "geek", "geezer"};
        System.out.println(longestCommonPrefix(arr));
    }   
} 