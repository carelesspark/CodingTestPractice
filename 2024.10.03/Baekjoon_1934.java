// import java.util.*;
// import java.io.*;

// public class Baekjoon_1934 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         int T = Integer.parseInt(br.readLine());
 
//         for(int i = 0; i < T; i++) {
//             StringTokenizer st = new StringTokenizer(br.readLine(), " ");

//             int A = Integer.parseInt(st.nextToken());
//             int B = Integer.parseInt(st.nextToken());

//             System.out.println(lcm(A, B));
//         }
//     }

//     public static int gcd(int A, int B){
//         if(B == 0){
//             return A;
//         }
        
//         return gcd(B, A % B);
//     }

//     public static int lcm(int A, int B){
//         return (A * B) / gcd(A, B);
//     }
// }


import java.util.*;
import java.io.*;

public class Baekjoon_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
 
        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append(lcm(A, B)).append("\n");
        }

        sb.deleteCharAt(sb.length() - 1);

        System.out.println(sb);
        
    }

    public static int gcd(int A, int B){
        if(B == 0){
            return A;
        }
        
        return gcd(B, A % B);
    }

    public static int lcm(int A, int B){
        return (A * B) / gcd(A, B);
    }
}