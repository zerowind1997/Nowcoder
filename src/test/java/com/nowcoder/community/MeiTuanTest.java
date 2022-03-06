package com.nowcoder.community;
import java.util.*;

public class MeiTuanTest {

//    static int max = Integer.MIN_VALUE;
//    static int min = Integer.MAX_VALUE;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        sc.nextLine();
//        List<List<Integer>> adj = new ArrayList<>();
//        int[] weight = new int[n];
//        for (int i = 0; i < n; i++) {
//            weight[i] = sc.nextInt();
//            adj.add(new ArrayList<>());
//        }
//        sc.nextLine();
//        for (int i = 0; i < m; i++) {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            adj.get(x - 1).add(y - 1);
//            adj.get(y - 1).add(x - 1);
//            sc.nextLine();
//        }
//
//        for (int i = 0; i < n; i++) bfs(adj, weight, i);
//        System.out.println(max + " " + min);
//
//    }
//
//    public static void bfs(List<List<Integer>> adj, int[] weight, int s) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(s);
//        boolean flag = true;
//        int sum = 0, min_path = Integer.MAX_VALUE;
//        boolean[] visited = new boolean[weight.length];
//        while (!queue.isEmpty()) {
//            int len = queue.size();
//            for (int i = 0; i < len; i++) {
//                int val = queue.poll();
//                if (flag) {
//                    sum += weight[val];
//                    min_path = Math.min(min_path, weight[val]);
//                }
//                visited[val] = true;
//                for (Integer v : adj.get(val)) {
//                    if (!visited[v]) queue.offer(v);
//                }
//            }
//            flag = !flag;
//        }
//        if (max < sum) {
//            max = sum;
//            min = min_path;
//        }
//        else if (max == sum && min > min_path) min = min_path;
//    }
//    static int[] nums = new int[]{3,4,-1,1};
//
//    public static void main(String[] args) {
//        firstMissingPositive();
//        for (int num : nums) System.out.println(num);
//    }
//
//    public static int firstMissingPositive() {
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < 0) nums[i] = nums.length + 1;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > 0 && nums[i] <= nums.length)
//                nums[nums[i] - 1] = nums[nums[i] - 1] > 0 ? -nums[nums[i] - 1] : nums[nums[i] - 1];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] >= 0) return i + 1;
//        }
//        return nums.length + 1;
//    }



//    3.3 蚂蚁上树
//    static int[][] dp;
//    static int[][] min;
//    static List<List<Integer>> adj = new ArrayList<>();
//    static int[] weight;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        sc.nextLine();
//        weight = new int[n];
//        for (int i = 0; i < n; i++) {
//            weight[i] = sc.nextInt();
//            adj.add(new ArrayList<>());
//        }
//        sc.nextLine();
//        for (int i = 0; i < m; i++) {
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//            adj.get(x - 1).add(y - 1);
//            adj.get(y - 1).add(x - 1);
//            sc.nextLine();
//        }
//        dp = new int[n][n];
//        min = new int[n][n];
//        dfs(0, -1);
//        int s1, s2;
//        if (dp[0][1] > dp[0][0]) {
//            s1 = dp[0][1]; s2 = min[0][1];
//        }
//        else if (dp[0][1] < dp[0][0]) {
//            s1 = dp[0][0]; s2 = min[0][0];
//        }
//        else {
//            s1 = dp[0][0];
//            s2 = Math.max(min[0][0], min[0][1]);
//        }
//        System.out.println(s1 + " " + s2);
//    }
//
//    public static void dfs(int x, int fa) {
//        dp[x][1] = weight[x];
//        dp[x][0] = 0;
//        min[x][1] = weight[x];
//        min[x][0] = Integer.MAX_VALUE;
//
//        for (Integer son : adj.get(x)) {
//            if (son == fa) continue;
//            dfs(son, x);
//            dp[x][1] += dp[son][0];
//            dp[x][0] += Math.max(dp[son][1], dp[son][0]);
//            min[x][1] = Math.min(min[x][1], min[son][0]);
//            if (dp[son][1] < dp[son][0]) min[x][0] = Math.min(min[x][0], min[son][0]);
//            else if (dp[son][1] > dp[son][0]) min[x][0] = Math.min(min[x][0], min[son][1]);
//            else min[x][0] = Math.min(min[x][0], Math.max(min[son][0], min[son][1]));
//        }
//
//    }


//    3.1 寻找数字
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        StringBuilder sb = new StringBuilder();
//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        int len = str.length(), i = 0;
//        while (i < len) {
//            while (i < len && (str.charAt(i) < '0' || str.charAt(i) > '9')) i++;
//            while (i < len - 1 && str.charAt(i) == '0' && str.charAt(i + 1) == '0') i++;
//            if (i < len - 1 && str.charAt(i) == '0' && str.charAt(i + 1) > '0' &&  str.charAt(i + 1) <= '9') i++;
//            while (i < len && str.charAt(i) >= '0' && str.charAt(i) <= '9') sb.append(str.charAt(i++));
//            if (sb.length() > 0) queue.offer(Integer.parseInt(sb.toString()));
//            sb.delete(0, sb.length());
//        }
//        while (!queue.isEmpty()) System.out.println(queue.poll());
//    }

}



/*import java.util.*;

public class Main{
    static int[][][] dp;
    static int[] w;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        w = new int[n];
        for (int i = 0; i < n; i++) w[i] = sc.nextInt();
        dp = new int[n][n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) dp[i][j][k] = -1;
             }
        }
        System.out.println(tree_dp(0, n - 1, -1));
    }

    public static int tree_dp(int l, int r, int p) {
        if (l > r) return 0;
        if (p >= 0 && dp[l][r][p] != -1) return dp[l][r][p];
        int min = Integer.MAX_VALUE;
        for (int i = l; i <= r; i++) {
            int left = tree_dp(l, i - 1, i);
            int right = tree_dp(i + 1, r, i);
            min = Math.min(min, left + right + w[i] *(p != -1? w[p]: 0));
        }
        if (p >= 0) dp[l][r][p] = min;
        return min;
    }

}
*/