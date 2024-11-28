// import java.util.*;
// import java.io.*;

// public class Baekjoon_11651 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
//         int N = Integer.parseInt(br.readLine());
//         int[][] temp = new int[N][2];

//         for(int i = 0; i < N; i++) {
//             StringTokenizer st = new StringTokenizer(br.readLine(), " ");

//             temp[i][0] = Integer.parseInt(st.nextToken());
//             temp[i][1] = Integer.parseInt(st.nextToken());
//         }

//         Arrays.sort(temp, new Comparator<int[]>() {
//             @Override
//             public int compare(int[] o1, int[] o2) {
//                 if(o1[1] == o2[1]) {
//                     return o1[0] - o2[0];
//                 }

//                 return o1[1] - o2[1];
//             }
//         });

//         StringBuilder sb = new StringBuilder();
//         for(int i = 0; i < N; i++) {
//             if(i == N - 1) {
//                 sb.append(temp[i][0]).append(" ").append(temp[i][1]);
//             } else {
//                 sb.append(temp[i][0]).append(" ").append(temp[i][1]).append("\n");
//             }
//         }

//         System.out.println(sb);
//     }
// }

import java.util.*;
import java.io.*;

public class Baekjoon_11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[][] temp = new int[N][2];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            temp[i][0] = Integer.parseInt(st.nextToken());
            temp[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(temp, (e1, e2) -> {
            if(e1[1] == e2[1]) {
                return e1[0] - e2[0];
            } 
            
            return e1[1] - e2[1];
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            if(i == N - 1) {
                sb.append(temp[i][0]).append(" ").append(temp[i][1]);
            } else {
                sb.append(temp[i][0]).append(" ").append(temp[i][1]).append("\n");
            }
        }

        System.out.println(sb);
    }
}
