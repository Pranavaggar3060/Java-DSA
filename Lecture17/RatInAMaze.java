package Lecture17;

public class RatInAMaze {
    static int[][] ans=new int[100][100];
    static int count=1;
    static int[][] minipath=new int[100][100];
    static void display(int x,int y){
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    static boolean findcheeze(int[][] maze, int i,int j, int x, int y){
        if(i==x && j==y){
            ans[i][j]=count;
            return true;
        }
        if(i<maze.length && j<maze[0].length && j>=0 && i>=0 && maze[i][j]==0 && ans[i][j]==0){
            ans[i][j]=count++;
            if(findcheeze(maze,i+1,j,x,y)){
                //move down
                return true;
            }
            if(findcheeze(maze,i,j+1,x,y)){
                //move right
                return true;
            }
            if(findcheeze(maze, i, j-1, x, y)){
                //move left
                return true;
            }
            if(findcheeze(maze,i-1,j,x,y)){
                //move up
                return true;
            }
            ans[i][j]=0;
            count--; //backtracking
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] maze={
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0}
        };
        int x=0,y=0;
        int i=3,j=4;
        findcheeze(maze, i, j, x, y);
        display(maze.length,maze[0].length);

    }
}
