import java.util.*;
import java.io.*;

public class Baekjoon_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] temp = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            temp[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(temp);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < M; i++) { 
            int num = Integer.parseInt(st.nextToken());
            sb.append(upperBound(temp, num) - lowerBound(temp, num)).append(" ");
        }

        System.out.println(sb.toString().trim());
    }

    public static int lowerBound(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length;

        while (lo < hi) {
            int mid = (lo + hi) / 2;

            if(key <= arr[mid]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }

    public static int upperBound(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length;

        while (lo < hi) {
            int mid = (lo + hi) / 2;

            if(key < arr[mid]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }
}


// import java.util.*;
// import java.io.*;

// public class Baekjoon_10816 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringBuilder sb = new StringBuilder();
//         int N = Integer.parseInt(br.readLine());
//         HashMap<Integer, Integer> map = new HashMap<>();

//         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//         for(int i = 0; i < N; i++) {
//             int num = Integer.parseInt(st.nextToken());
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }

//         int M = Integer.parseInt(br.readLine());
//         st = new StringTokenizer(br.readLine(), " ");
//         for(int i = 0; i < M; i++) { 
//             int temp = Integer.parseInt(st.nextToken());
//             sb.append(map.getOrDefault(temp, 0)).append(" ");
//         }

//         System.out.println(sb.toString().trim());
//     }
// }
