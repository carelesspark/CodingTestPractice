import java.util.*;
import java.io.*;

public class Baekjoon_11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] temp = new int[N];
        int i = 0;

        st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) {
            temp[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        Arrays.sort(temp);
        System.out.println(temp[K - 1]);
    }
}
