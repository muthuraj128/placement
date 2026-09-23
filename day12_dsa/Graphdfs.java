package day12_dsa;

import java.util.*;

public class Graphdfs {
       int[][] arr;
    int vertices;
    Graphdfs(int vertices){
        this.vertices=vertices;
        arr=new int[vertices][vertices];
    }
    void add(int x,int y,int data){
        arr[x][y]=data;
        arr[y][x]=data;
    }
    void display(){
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    void dfs(int start){
        boolean []visit=new boolean[vertices];
        System.out.println("DFS: ");
        dfsRecursive(start,visit);
    }
    void dfsRecursive(int cu,boolean [] visit){
        visit[cu]=true;
        System.out.println(cu+" ");
        for(int i=0;i<vertices;i++){
            if(arr[cu][i]==1 && !visit[i]){
                dfsRecursive(i,visit);
            }
        }
    }
    public static void main(String[] args){
        Graphdfs obj=new Graphdfs(5);
        obj.add(0,1,10);
        obj.add(0,2,20);
        obj.add(1,3,30);
        obj.add(2,4,40);
        obj.add(3,4,50);
        obj.display();
        obj.dfs(0);
    }
}
