package day12_dsa;

public class Graph {
    int[][] arr;
    int vertices;
    Graph(int vertices){
        this.vertices=vertices;
        arr=new int[vertices][vertices];
    }
    void add(int x,int y){
        arr[x][y]=1;
        arr[y][x]=1;
    }
    void display(){
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Graph obj=new Graph(5);
        obj.add(0,1);
        obj.add(0,2);
        obj.add(1,3);
        obj.add(2,4);
        obj.add(3,4);
        obj.display();
    }
}
