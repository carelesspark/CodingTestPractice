import java.util.*;
import java.io.*;

public class Baekjoon_1244 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] temp = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            temp[i] = Integer.parseInt(st.nextToken());
        }

        int student = Integer.parseInt(br.readLine());
        for(int i = 0; i < student; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int gender = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if(gender == 1) {
                for(int j = num - 1; j < N; j += num) {
                    temp[j] = (temp[j] == 0) ? 1 : 0;
                }
            } else {
                int left = num - 2;
                int right = num;
                temp[num - 1] = (temp[num - 1] == 0) ? 1 : 0;

                while (left >= 0 && right < N && temp[left] == temp[right]) {
                    temp[left] = (temp[left] == 0) ? 1 : 0;
                    temp[right] = (temp[right] == 0) ? 1 : 0;

                    left--;
                    right++;
                }
            }
        }

        for(int i = 0; i < N; i++) {
            sb.append(temp[i]).append(" ");
            if((i + 1) % 20 == 0) {
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
