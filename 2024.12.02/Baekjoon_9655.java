import java.io.*;
import java.util.*;

public class Baekjoon_9655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] temp = new int[1001];

        temp[1] = 1;
        temp[2] = 2;
        temp[3] = 3;

        for(int i = 4; i <= N; i++) {
            temp[i] = Math.min(temp[i - 1], temp[i - 3]) + 1;
        }

        if(temp[N] % 2 == 0) {
            System.out.println("CY");
        } else {
            System.out.println("SK");
        }
    }
}

// import java.io.*;
// import java.util.*;

// public class Baekjoon_9655 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         int N = Integer.parseInt(br.readLine());

//         if(N % 2 == 0) {
//             System.out.println("CY");
//         } else {
//             System.out.println("SK");
//         }
//     }
// }