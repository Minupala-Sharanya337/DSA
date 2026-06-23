import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int numbers[] = new int[n];
        for(int i=0;i<n;i++){
         numbers[i]=sc.nextInt();
         } 

        HashSet<Integer> visited = new HashSet<>();
        int repeated = -1;

        for (int value : numbers) {
            if (visited.contains(value)) {
                repeated = value;
            } else {
                visited.add(value);
            }
        }

        int missing = -1;
        for (int count = 1; count <= size; count++) {
            if (!visited.contains(count)) {
                missing = count;
                break;
            }
        }

        System.out.println("Repeated Number = " + repeated);
        System.out.println("Missing Number = " + missing);

/* input:
 5
 5 4 1 2 4
Output:
 Repeated Number = 4
 Missing Number = 3

   
    }
} 
