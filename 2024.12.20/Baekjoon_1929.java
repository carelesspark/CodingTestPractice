import java.util.*;
import java.io.*;

public class Baekjoon_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        boolean[] temp = new boolean[N + 1];
        List<Integer> list = new ArrayList<>();

        for(int i = 2; i <= N; i++) {
            int count = 0;
            for(int j = i; j <= N; j += i) {
                if(temp[j] == false) {
                    temp[j] = true;
                    if(count == 0) {
                        list.add(j);
                    }
                    count++;
                }
            }
        }

        for(Integer i : list) {
            if(i >= M) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}
