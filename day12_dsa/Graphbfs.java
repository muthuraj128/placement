package day12_dsa;
import java.util.*;
public class Graphbfs {
        int[][] arr;
    int vertices;
    Graphbfs(int vertices){
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
    void bfs(int start){
        boolean[] visit=new boolean[vertices];
        Queue<Integer> queue=new LinkedList<>();
        visit[start]=true;
        queue.add(start);
        while(!queue.isEmpty()){
            int current=queue.poll();
            System.out.println(current);
            for(int i=0;i<vertices;i++){
                if(arr[current][i]==1&&!visit[i]){
                    visit[i]=true;
                    queue.add(i);
                }
            }
        }

    }
    public static void main(String[] args){
        Graphbfs obj=new Graphbfs(5);
        obj.add(0,1,10);
        obj.add(0,2,20);
        obj.add(1,3,30);
        obj.add(2,4,40);
        obj.add(3,4,50);
        obj.display();
        obj.bfs(0);
    }
}
