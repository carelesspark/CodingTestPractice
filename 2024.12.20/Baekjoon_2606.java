import java.util.*;
import java.io.*;

public class Baekjoon_2606 {
    static List<List<Integer>> graph;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        visited = new boolean[n + 1];
        dfs(1);
        System.out.println(count - 1); // 1번 컴퓨터 제외
    }

    public static void dfs(int node) {
        visited[node] = true;
        count++;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }
}

// import java.util.*;
// import java.io.*;

// public class Baekjoon_2606 {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int N = Integer.parseInt(br.readLine());
//         int M = Integer.parseInt(br.readLine());

//         List<List<Integer>> graph = new ArrayList<>();
//         for(int i = 0; i <= N; i++) {
//             graph.add(new ArrayList<>());
//         }

//         for(int i = 0; i < M; i++) {
//             StringTokenizer st = new StringTokenizer(br.readLine());
//             int a = Integer.parseInt(st.nextToken());
//             int b = Integer.parseInt(st.nextToken());
//             graph.get(a).add(b);
//             graph.get(b).add(a);
//         }

//         boolean[] visited = new boolean[N + 1];
//         Queue<Integer> queue = new LinkedList<>();
//         queue.add(1);
//         visited[1] = true;

//         int count = 0;

//         while (!queue.isEmpty()) {
//             int current = queue.poll();
//             for(int neighbor : graph.get(current)) {
//                 if(!visited[neighbor]) {
//                     visited[neighbor] = true;
//                     queue.add(neighbor);
//                     count++;
//                 }
//             }
//         }

//         System.out.println(count);
//     }
// }
