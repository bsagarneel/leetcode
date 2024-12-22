import java.util.HashMap;

public class TwoSum {
  
    private static int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> numsMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(numsMap.containsKey(complement)){
                return new int[]{numsMap.get(complement),i};
            }
            else{
                numsMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }
 
    public static void main(String[] args) {
         int[] arr = new int[]{2,4,3,7,9};
        for(int i=0; i<twoSum(arr, 10).length;i++){
            System.out.println(arr[i]);
        }
    }
}
