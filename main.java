import java.util.Arrays; //importing so I can call Arrays.toString to print test result

public class main { //Main function to test TargetSearch implementation
    public static void main(String[] args){
        int [] array = new int[]{1,13,18,20,30, 40, 2,4,54,3,6,8,6,5}; // This is the test array passed into TargetSearch
        int target = 40; // This is the target to search for
        TargetSearch labTest = new TargetSearch(); //constructor since we aren't static
        System.out.println(Arrays.toString(labTest.twoSum(array,target))); //call to TargetSearch function and prints output array
    }
}
