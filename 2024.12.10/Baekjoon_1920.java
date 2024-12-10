import java.util.*;
import java.io.*;

public class Baekjoon_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < M; i++) {
            int input = Integer.parseInt(st.nextToken());
            sb.append(set.contains(input) ? 1 : 0).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}

// import java.util.*;
// import java.io.*;

// public class Baekjoon_1920 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int N = Integer.parseInt(br.readLine());
//         int[] temp = new int[N];

//         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//         for(int i = 0; i < N; i++) {
//             temp[i] = Integer.parseInt(st.nextToken());
//         }

//         Arrays.sort(temp);

//         int M = Integer.parseInt(br.readLine());
//         StringBuilder sb = new StringBuilder();
        
//         st = new StringTokenizer(br.readLine(), " ");
//         for(int i = 0; i < M; i++) {
//             int input = Integer.parseInt(st.nextToken());
//             if(Arrays.binarySearch(temp, input) >= 0) {
//                 sb.append(1).append("\n");
//             } else {
//                 sb.append(0).append("\n");
//             }
//         }

//         sb.deleteCharAt(sb.length() - 1);
//         System.out.println(sb);
//     }
// }


// import java.util.*;
// import java.io.*;

// public class Baekjoon_1920 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int N = Integer.parseInt(br.readLine());
//         int[] temp = new int[N];

//         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//         for(int i = 0; i < N; i++) {
//             temp[i] = Integer.parseInt(st.nextToken());
//         }

//         int M = Integer.parseInt(br.readLine());
//         StringBuilder sb = new StringBuilder();
        
//         st = new StringTokenizer(br.readLine(), " ");
//         for(int i = 0; i < M; i++) {
//             int input = Integer.parseInt(st.nextToken());
//             int count = 0;

//             for(int j = 0; j < N; j++) {
//                 if(input == temp[j]) {
//                     count++;
//                     break;
//                 }
//             }

//             sb.append(count).append("\n");
//         }
//         sb.deleteCharAt(sb.length() - 1);
//         System.out.println(sb);
//     }
// }
