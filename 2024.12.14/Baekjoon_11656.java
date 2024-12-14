import java.util.*;
import java.io.*;

public class Baekjoon_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String S = br.readLine();

        String[] temp = new String[S.length()];

        for(int i = 0; i < S.length(); i++) {
            temp[i] = S.substring(i, S.length());
        }

        Arrays.sort(temp);
        for(String print : temp) {
            sb.append(print).append("\n");
        }
        System.out.println(sb);
    }
}


// import java.util.*;
// import java.io.*;

// public class Baekjoon_11656 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringBuilder sb = new StringBuilder();
//         String S = br.readLine();

//         String[] temp = new String[S.length()];

//         for(int i = 0; i < S.length(); i++) {
//             if(i == S.length() - 1) {
//                 temp[i] = Character.toString(S.charAt(i));
//             } else {
//                 temp[i] = Character.toString(S.charAt(i));
//                 for(int j = i + 1; j < S.length(); j++) {
//                     String s = temp[i];
//                     temp[i] = s.concat(Character.toString(S.charAt(j)));
//                 }
//             }
//         }

//         Arrays.sort(temp);
//         for(String print : temp) {
//             System.out.println(print);
//         }
//     }
// }
