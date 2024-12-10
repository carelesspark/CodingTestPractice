import java.util.*;
import java.io.*;

public class Baekjoon_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();
        int K = Integer.parseInt(br.readLine());

        for(int i = 0; i < K; i++) {
            int temp = Integer.parseInt(br.readLine());

            if(temp == 0) {
                deque.pop();
            } else {
                deque.addFirst(temp);
            }
        }
        
        int sum = 0;
        for(int i : deque) {
            sum += i;
        } 

        System.out.println(sum);
    }
}
