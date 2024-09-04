package DSA.Recursion.BackTraking.Mazeproblem;

import java.util.Arrays;

public class PrintMatrixAndPath {
    public static void main(String[] args) {
        boolean[][] board ={
                {true, true, true},
                {true, true, true},
                {true, true, true},

        };
        int[][]path=new int[board.length][board[0].length];
        allPathPrintMatrix("", board, 0, 0, path, 1);

    }
    static void allPathPrintMatrix(String p, boolean [][]maze, int r, int c, int[][]path, int steps){
        if(r==maze.length-1 && c== maze[0].length-1){
            path[r][c]=steps;
          for (int[]arr:path){
              System.out.println(Arrays.toString(arr));
          }
            System.out.println(p);
            System.out.println();
            return;
        }
        // i am considering this block in my path
        if(maze[r][c]==false){
            return;
        }
        maze[r][c]=false;

        path[r][c]=steps;
        if(r<maze.length-1){
            allPathPrintMatrix(p+'D',maze,r+1, c, path, steps+1);
        }
        if(c<maze[0].length-1){
            allPathPrintMatrix(p+'R', maze,r, c+1, path, steps+1);
        }
        if(c>0){
            allPathPrintMatrix(p+'L', maze,r, c-1, path, steps+1);
        }
        if(r>0){
            allPathPrintMatrix(p+'U',maze,r-1, c, path, steps+1);
        }
        //this line is where th function will be over
        //so before the function gets removed, also remove the changes that were made by that function
        maze[r][c]=true;
        path[r][c]=0;




    }
}
