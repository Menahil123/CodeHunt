import java.util.*;
public class inputMaxMin {
    public static int setMin(int[] A, int N) {
        int Min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (A[i] < Min) {
                Min = A[i];
            }
        }
        return Min;
    }
    public static int setMax(int[] A, int N) {
        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (A[i] > Max) {
                Max = A[i];
            }
        }
        return Max;
    }
    public static void main(String[] args) {
        int[] arr = { 3, 5, 4, 1, 9 };
        int N = arr.length;
        System.out.println("Minimum element is: " + setMin(arr, N));
        System.out.println("Maximum element is: " + setMax(arr, N));
    }
}

