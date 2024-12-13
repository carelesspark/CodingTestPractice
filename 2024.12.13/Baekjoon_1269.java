import java.util.*;
import java.io.*;

public class Baekjoon_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < M; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        HashSet<Integer> temp = new HashSet<>(A);
        temp.addAll(B);
        A.retainAll(B);
        temp.removeAll(A);
        System.out.println(temp.size());
    }
}

// import java.util.*;
// import java.io.*;

// public class Baekjoon_1269 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//         HashSet<Integer> A = new HashSet<>();
//         HashSet<Integer> B = new HashSet<>();
//         HashSet<Integer> temp = new HashSet<>();
        

//         int N = Integer.parseInt(st.nextToken());
//         int M = Integer.parseInt(st.nextToken());
        
//         st = new StringTokenizer(br.readLine(), " ");
//         for(int i = 0; i < N; i++) {
//             A.add(Integer.parseInt(st.nextToken()));
//         }

//         st = new StringTokenizer(br.readLine(), " ");
//         for(int i = 0; i < M; i++) {
//             B.add(Integer.parseInt(st.nextToken()));
//         }

//         temp.addAll(A);
//         A.removeAll(B);
//         B.removeAll(temp);
//         int element = A.size() + B.size();

//         System.out.println(element);
//     }
// }
