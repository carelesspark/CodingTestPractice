import java.util.*;

public class Baekjoon_2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        int days = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0){
            days++;
        }

        System.out.println(days);
    }
}