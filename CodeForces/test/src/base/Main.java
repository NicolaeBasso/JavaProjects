package base;

import java.io.*;
import java.util.*;

public class Main{
    static File file = new File("input.txt");
    static Scanner in;

    static {
        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static int vertices = in.nextInt(), edges = in.nextInt(), a, b;
    static ArrayList<Integer> AdjList[] = new ArrayList[vertices + 1], VertexGroup[] = new ArrayList[3];
    static int VertexColor[] = new int[vertices + 1];

    public static boolean dfs(int v, int color){
        VertexColor[v] = color;
        VertexGroup[color].add(v);

        for(int u: AdjList[v]){
            if(VertexColor[u] == 0 && dfs(u, 3 - color) == true)
                return true;
            if(VertexColor[u] != 3 - color)
                return true;
        }

        return false;
    }

    public static void main(String[] args) throws Exception{
        for(int i = 0; i <= vertices; i++){
            AdjList[i] = new ArrayList<Integer>();
        }
        VertexGroup[0] = new ArrayList<Integer>();
        VertexGroup[1] = new ArrayList<Integer>();
        VertexGroup[2] = new ArrayList<Integer>();

        for(int i = 0; i < edges; i++){
            a = in.nextInt(); b = in.nextInt();

            AdjList[a].add(b);
            AdjList[b].add(a);
        }

        /*for(int i = 0; i <= n; i++){
            System.out.print(i + ": ");

            for(int j = 0; j < AdjList[i].size(); j++)
                System.out.print(AdjList[i].get(j) + " ");

            System.out.println();
        }*/

        for(int i = 0; i <= vertices; i++){
            if(VertexColor[i] == 0){
                if(AdjList[i].isEmpty() == true)
                    continue;
                if(dfs(i, 2) == true){
                    System.out.println(-1);
                    System.exit(0);
                }
            }
        }

        // VertexGroup[0] is an ArrayList of UNCOLORED VERTICES
        for(int i = 1; i <= 2; i++){
            System.out.println(VertexGroup[i].size());

            for(int v: VertexGroup[i]){
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}