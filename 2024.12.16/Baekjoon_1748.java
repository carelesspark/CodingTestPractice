import java.util.*;
import java.io.*;

public class Baekjoon_1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int plus = 1;
        int num = 10;
        for(int i = 1; i <= N; i++) {
            if(i % num == 0) {
                plus++;
                num *= 10;
            }
            count += plus;
        }
        System.out.println(count);
    }
}

// import java.util.*;
// import java.io.*;

// public class Baekjoon_1748 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringBuilder sb = new StringBuilder();

//         int N = Integer.parseInt(br.readLine());
//         for(int i = 1; i <= N; i++) {
//             sb.append(i);
//         }

//         System.out.println(sb.length());
//     }
// }
