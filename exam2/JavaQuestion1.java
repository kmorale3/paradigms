public class JavaQuestion{
	public static int findMaxConsecutiveNumbers(int[] nums) {
	    /* your solution goes here */
        // assigned number is 493
        if (nums.length == 0) {
            return 0;
        }
        int assignNum = 493;
        int consecutiveNums;
        int maxConsecutive;
        if (nums[0] == assignNum) {
            consecutiveNums = 1;
            maxConsecutive  = 1;
        }
        else {
            consecutiveNums = 0;
            maxConsecutive  = 0;
        }
        for (int i = 1; i < nums.length; i ++) {
            if (nums[i] == assignNum) {
                consecutiveNums = consecutiveNums + 1;
            }
            else {
                consecutiveNums = 0;
            }
            if (consecutiveNums > maxConsecutive) {
                maxConsecutive = consecutiveNums; 
            }

        }
        return maxConsecutive;
	}

    public static void main (String [] args){
        int [] nums = new int[]{};
        System.out.println(findMaxConsecutiveNumbers(nums));// 0
        nums = new int[]{493};
        System.out.println(findMaxConsecutiveNumbers(nums));// 1
        nums = new int[]{493,493};
        System.out.println(findMaxConsecutiveNumbers(nums));// 2
        nums = new int[]{493,0,493};
        System.out.println(findMaxConsecutiveNumbers(nums));// 1
        nums = new int[]{493,0,493,493};
        System.out.println(findMaxConsecutiveNumbers(nums));// 2
        nums = new int[]{493,493,0,493};
        System.out.println(findMaxConsecutiveNumbers(nums));// 2

        
    }
}