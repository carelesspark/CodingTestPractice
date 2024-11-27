// import java.util.*;
// import java.io.*;

// public class Baekjoon_10814 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         int repeat = Integer.parseInt(br.readLine());

//         String[][] temp = new String[repeat][2];

//         for(int i = 0; i < repeat; i++) {
//             StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//             temp[i][0] = st.nextToken();
//             temp[i][1] = st.nextToken();
//         }

//        Arrays.sort(temp, Comparator.comparingInt(a -> Integer.parseInt(a[0])));

//        for(int i = 0; i < repeat; i++) {
//             System.out.println(temp[i][0] + " " + temp[i][1]);
//        }
//     }
// }

import java.util.*;
import java.io.*;

public class Baekjoon_10814 {
    static class Member {
        int age;
        String name;

        Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int repeat = Integer.parseInt(br.readLine());
        Member[] member = new Member[repeat];

        for(int i = 0; i < repeat; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            member[i] = new Member(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        Arrays.sort(member, (o1, o2) -> {
            return o1.age - o2.age;
        });

        for(int i = 0; i < repeat; i++) {
            System.out.println(member[i].age + " " + member[i].name);
        }
    }
}