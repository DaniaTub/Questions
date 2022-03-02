package com.jhf.testques;
public class QuestionSixteen {
	/*Example 1:
		Input: nums = [1,1,2]
		Output: 2, nums = [1,2]
		Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
		It does not matter what you leave beyond the returned k (hence they are underscores).
		Example 2:
		Input: nums = [0,0,1,1,1,2,2,3,3,4]
		Output: 5, nums = [0,1,2,3,4]
		Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
		It does not matter what you leave beyond the returned k (hence they are underscores).
	*/
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7}; //,6,7,7,7};
        //1,3,5,6,7
        removeDuplicates(nums);
    }

    private static int removeDuplicates(int[] nums) {
        int result =0;
        int[] arr = null;
        try{
            if(nums.length <=1 || nums ==null)
            {
                result =0;
            }
            else {
                int j=1;
                arr = new int[nums.length];
                arr[0]=nums[0];
                for(int i=0 ;i< nums.length-1;i++)
                {
                    if(nums[i+1] != arr[j-1]) {
                        arr[j] = nums[i + 1];
                        j++;
                    }
                }

                result = nums.length - j;
            }
        }catch ( RuntimeException rex)
        {
            throw new RuntimeException ("the ");
        }

        for (int i=0 ;i<arr.length ; i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println( );
        System.out.println(" "+result);
        return result;
    }
}