import java.util.Scanner;

public class Main {
    public static void backtracking(int[] arr, int start, String current) {
        if (!current.isEmpty()) {
            System.out.println(current.trim());
        }

        for (int i = start; i < arr.length; i++) {
            backtracking(arr, i + 1, current + arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println("All combinations:");
        backtracking(arr, 0, "");
    }
}
