package ForLoop;

public class sortNumbers {
    public static void main (String [] args) {
        int [] nums = {4,10,3,2,15,25,1};
        int swap;
        for (int o = 0; o< nums.length;o++) {
            System.out.println(nums[o]);
            for (int i = o+1; i < nums.length;i++) {
                System.out.println("Before " + nums[o] +" , " + nums[i]);
                if (nums[o] > nums[i]) {
                    swap = nums[o];
                    nums[o] = nums[i];
                    nums[i] = swap;
                    System.out.println("After " + nums[o] +" , " + nums[i]);
                }
            }
        }
        String result;
        result = "";
        for (int p = 0; p < nums.length-1; p++) {
            result = result + nums[p] + ", " ;
        }
        result = result + nums[nums.length-1];
        System.out.println(result);
    }
}

