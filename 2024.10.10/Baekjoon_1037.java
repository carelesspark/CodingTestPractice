// import java.util.*;
// import java.io.*;

// public class Baekjoon_1037 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
//         int cnt = Integer.parseInt(br.readLine());
//         int[] temp = new int[cnt];

//         StringTokenizer st = new StringTokenizer(br.readLine(), " ");

//         for(int i = 0; i < cnt; i++){  
//             temp[i] = Integer.parseInt(st.nextToken());   
//         }

//         Arrays.sort(temp);
        
//         int min = Arrays.stream(temp).min().getAsInt();
//         int max = Arrays.stream(temp).max().getAsInt();
       
//         System.out.println(min * max);
//     }
// }

// import java.util.*;
// import java.io.*;

// public class Baekjoon_1037 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
//         int cnt = Integer.parseInt(br.readLine());
//         int[] temp = new int[cnt];

//         StringTokenizer st = new StringTokenizer(br.readLine(), " ");

//         for(int i = 0; i < cnt; i++){  
//             temp[i] = Integer.parseInt(st.nextToken());   
//         }

//         Arrays.sort(temp);
        
//         int result = temp[0] * temp[cnt - 1];
//         System.out.println(result);
//     }
// }

import java.util.*;
import java.io.*;

public class Baekjoon_1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int cnt = Integer.parseInt(br.readLine());
        int[] temp = new int[cnt];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < cnt; i++){  
            temp[i] = Integer.parseInt(st.nextToken());   
        }

        int min = Arrays.stream(temp).min().getAsInt();
        int max = Arrays.stream(temp).max().getAsInt();

        System.out.println(min * max);
    }
}