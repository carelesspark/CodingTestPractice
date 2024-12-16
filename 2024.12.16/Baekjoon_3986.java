import java.util.*;
import java.io.*;

public class Baekjoon_3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i < N; i++) {
            Deque<Character> deque = new ArrayDeque<>();
            char[] temp = br.readLine().toCharArray();
            for(char c : temp) {
                if(!deque.isEmpty()) {
                    if(deque.getFirst().equals(c)) {
                        deque.pop();
                        continue;
                    }
                }
                deque.addFirst(c);
                System.out.println(deque.toString());
            }

            if(deque.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
