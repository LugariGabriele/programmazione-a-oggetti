package array;
/*
Given a non-empty array, return true if there is a place to split the array
so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
    */
public class CanBalance {
    public static int sum(int[] v, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum = sum + v[i];
        }
        return sum;
    }

    public static boolean canBalance(int[] v) {
        if (v.length < 2) { //se <2 non si può dividere
            return false;
        }
        int sumToStart = sum(v, 0, 1);
        int sumToEnd = sum(v, 1, v.length);
        for (int i = 1; i < v.length; i++) {
            if (sumToStart == sumToEnd) {
                return true;
            }
            sumToStart = sumToStart + v[i];
            sumToEnd = sumToEnd - v[i];
        }

        return false;


    }
}
