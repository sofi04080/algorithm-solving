import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.

        int[] nums = new int[] {a, b, c};
        Arrays.sort(nums);

        if(nums[1] - nums[0] == 1 && nums[2] - nums[1] == 1 ) System.out.print(0);
        else if (nums[1] - nums[0] == 2 || nums[2] - nums[1] == 2) System.out.print(1);
        else System.out.print(2);
    }
}