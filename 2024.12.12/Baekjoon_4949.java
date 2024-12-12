import java.util.*;
import java.io.*;

public class Baekjoon_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            Deque<Character> deque = new ArrayDeque<>();
            boolean isBalanced = true;
            String s = br.readLine();
            if (s.equals(".")) {
                break;
            }

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '[') {
                    deque.addFirst(c);
                }

                if (c == ')') {
                    if (deque.isEmpty() || deque.pop() != '(') {
                        isBalanced = false;
                        break;
                    }
                } else if (c == ']') {
                    if (deque.isEmpty() || deque.pop() != '[') {
                        isBalanced = false;
                        break;
                    }
                }   
            }
            if(!deque.isEmpty()) {
                isBalanced = false;
            }
            sb.append(isBalanced ? "yes" : "no").append("\n");
        }

        System.out.println(sb);
    }
}
