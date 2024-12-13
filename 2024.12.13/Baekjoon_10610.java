import java.util.*;
import java.io.*;

public class Baekjoon_10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String N = br.readLine();
        char[] temp = N.toCharArray();
        int sum = 0;

        boolean hasZero = false;
        for(char c : temp) {
            sum += c - '0';
            if(c == '0') {
                hasZero = true;
            }
        }

        if(!hasZero || sum % 3 != 0) {
            System.out.println(-1);
            return;
        }

        Arrays.sort(temp);
        sb.append(temp).reverse();
        System.out.println(sb);
    }
}


// import java.util.*;
// import java.io.*;

// public class Baekjoon_10610 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringBuilder sb = new StringBuilder();
//         String N = br.readLine();
//         char[] temp = new char[N.length()];
//         Integer[] intTemp = new Integer[temp.length];
//         int check = 0;
//         int sum = 0;

//         for(int i = 0; i < N.length(); i++) {
//             if(N.charAt(i) == '0') {
//                 check++;
//             }
//             temp[i] = N.charAt(i);
//         }

//         if(check == 0) {
//             System.out.println(-1);
//             return;
//         } else {
//             for(char c : temp) {
//                 sum += Character.getNumericValue(c);
//             }

//             if(sum % 3 != 0) {
//                 System.out.println(-1);
//                 return;
//             } else {
//                 for(int i = 0; i < temp.length; i++) {
//                     intTemp[i] = Character.getNumericValue(temp[i]);
//                 }

//                 Arrays.sort(intTemp, Collections.reverseOrder());
                
//                 for(Integer i : intTemp) {
//                     sb.append(i);
//                 }
//             }
//         }
//         System.out.println(sb);
//     }
// }
