import java.util.*;

class BeingZero {

    public static List<Integer> solve(int[] a, int n) {
        List<Integer> ans = new ArrayList<>();

        int[] freq = new int[100001];

        for (int i = 0; i < n; i++) {
            freq[a[i]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                ans.add(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        List<Integer> result = solve(a, n);

        for (int x : result) {
            System.out.print(x + " ");
        }

        
    }
  
}
/*
Input:
6
1 2 3 4 2 3

Output:  
2 3
        */
