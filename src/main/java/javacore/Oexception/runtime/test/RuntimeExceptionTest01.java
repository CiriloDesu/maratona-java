package javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        //Checked(compile) e Unchecked(run-time)
        //outOfBounds
        int[] nums = {1,2};
        System.out.println(nums[2]);
        //NullPointException
        Object object = null;
        System.out.println(object);
    }


}
