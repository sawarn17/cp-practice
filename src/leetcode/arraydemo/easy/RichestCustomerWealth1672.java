package leetcode.arraydemo.easy;

public class RichestCustomerWealth1672 {

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] customer : accounts) {
            int wealth = 0;
            for (int balance : customer) {
                wealth += balance;
            }
            maxWealth = Math.max(maxWealth, wealth);
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };
        maximumWealth(accounts);
    }
}
