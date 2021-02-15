public class TargetSearch { //Brute force method of finding two sums
    public int [] twoSum(int[] num, int sum) {
        for (int i = 0; i < num.length; i++) {
            for(int j = i + 1; j < num.length; j++) //nested loops to increment through each element of the array and check it's sum against other elements
                if (num[i] + num[j] == sum) { //if they're equal to target return those element locations.
                    return new int[] {i,j};
                }
        }
    return new int[] {-1}; //return -1 if no two elements sum to target
    }
}
