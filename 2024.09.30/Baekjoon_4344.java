import java.util.*;

public class Baekjoon_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();

        for (int i = 0; i < repeat; i++) {
            int n = sc.nextInt();
            int[] scores = new int[n];
            
            int sum = 0;
            for (int j = 0; j < n; j++) {
                scores[j] = sc.nextInt();
                sum += scores[j];
            }
            
            double avg = (double) sum / n; 

            int count = 0;
            for (int score : scores) {
                if (score > avg) {
                    count++;
                }
            }
            
            double percent = (double) count / n * 100;
            System.out.printf("%.3f%%\n", percent);
        }
    }
}