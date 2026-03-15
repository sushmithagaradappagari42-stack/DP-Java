import java.util.*;
public class HouseRobber {
    public static int robber(int[] money, int i) {
        if (i < 0) {
            return 0;
        }
        int include = money[i] + robber(money, i - 2);
        int exclude = robber(money, i - 1);
        return Math.max(include, exclude);
    }
    public static void main(String[] args) {
        int[] money = {2, 7, 9, 3, 1};
        int n = money.length;
        int result = robber(money, n - 1);
        System.out.println("Maximum money robbed: " + result);
    }
}