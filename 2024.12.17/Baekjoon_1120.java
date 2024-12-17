import java.util.*;
import java.io.*;

public class Baekjoon_1120 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String A = st.nextToken();
        String B = st.nextToken();

        int minValue = Integer.MAX_VALUE;
        for(int i = 0; i <= B.length() - A.length(); i++) {
            int difference = 0;
            for(int j = 0; j < A.length(); j++) {
                if(A.charAt(j) != B.charAt(i + j)) {
                    difference++;
                }
            }

            minValue = Math.min(minValue, difference);
        }

        System.out.println(minValue);
    }
}

// import java.util.*;
// import java.io.*;

// public class Baekjoon_1120 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//         List<Integer> list = new ArrayList<>();

//         String A = st.nextToken();
//         String B = st.nextToken();

//         for(int i = 0; i <= B.length() - A.length(); i++) {
//             int difference = 0;
//             for(int j = 0; j < A.length(); j++) {
//                 if(A.charAt(j) != B.charAt(i + j)) {
//                     difference++;
//                 }
//             }

//             list.add(difference);
//         }
//         Collections.sort(list);
//         System.out.println(list.get(0));
//     }
// }