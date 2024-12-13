import java.util.*;
import java.io.*;

public class Baekjoon_2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] temp = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            temp[i] = Integer.parseInt(st.nextToken());
        }

        int res = 0;

        int l, r, sum;
        l = r = sum = 0;

        while (true) {
            if(sum >= M) {
                sum -= temp[l++];
            } else if(r == N) {
                break;
            } else {
                sum += temp[r++];
            }

            if(sum == M) {
                res++;
            }
        }

        System.out.println(res);
    }
}

// import java.util.*;
// import java.io.*;

// public class Baekjoon_2003 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine(), " ");

//         int N = Integer.parseInt(st.nextToken());
//         int M = Integer.parseInt(st.nextToken());
//         int[] temp = new int[N];

//         st = new StringTokenizer(br.readLine(), " ");
//         for(int i = 0; i < N; i++) {
//             temp[i] = Integer.parseInt(st.nextToken());
//         }

//         int count = 0;
//         for(int i = 0; i < N; i++) {
//             int sum = 0;
            
//             sum = temp[i];
//             if(sum == M) {
//                 count++;
//             } else {
//                 for(int j = i + 1; j < N; j++) {
//                     if(j == N - 1) {
//                         sum += temp[j];
//                         break;
//                     } else {
//                         sum += temp[j];
//                         if(sum >= M) {
//                             break;
//                         }
//                     }
//                 }

//                 if(sum == M) {
//                     count++;
//                 }
//             }
            
//         }
//         System.out.println(count);
//     }
// }