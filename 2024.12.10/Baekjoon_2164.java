import java.util.*;
import java.io.*;

public class Baekjoon_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        while (deque.size() > 1) {
            deque.pop();
            deque.addLast(deque.getFirst());
            deque.pop();
        }

        System.out.println(deque.getFirst());
    }
}
