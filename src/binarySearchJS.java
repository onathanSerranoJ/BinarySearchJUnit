public class binarySearchJS {
    public static int BinarySearchJS(int[] nums, int target) {
//        first array
        int min = 0;
        int max = nums.length-1;
        int middleIndex = (min+max) / 2;
        Boolean found = false;
        int foundTarget = -1;
        int loopCount = 0;

        if(target > nums[nums.length-1])
        {
            found = true;
        }
        else if(target < nums[0])
        {
            found = true;
        }
        while (found == false)// a more efficient while loop is the target<nums[middleIndex]
        // || target > nums[middleIndex]
        {
            if(loopCount > nums.length/2)
            {
                foundTarget = -1;
                found = true;
            }
            if (target == nums[middleIndex])
            {
                foundTarget = middleIndex;
                found = true;
            }
            else if (target < nums[middleIndex])
            {
                max = middleIndex;
                middleIndex = (min+max)/ 2;
            }
            else if (target > nums[middleIndex])
            {
                min = middleIndex;
                middleIndex = (min+max) / 2;
                if(middleIndex == min)
                {
                    middleIndex++;
                }
            }
            loopCount = loopCount+1;
        }
        return foundTarget;
    }
}