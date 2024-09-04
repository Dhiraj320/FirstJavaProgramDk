package DSA.Recursion.BackTraking.Mazeproblem;

public class pathWithObstacles {
    public static void main(String[] args) {
        boolean[][] board ={
                {true, true, true},
                {true, false, true},
                {true, true, true},

        };
        pathWithObstacles("", board, 0, 0);

    }
    static void pathWithObstacles(String p,boolean [][]maze,int r, int c){
        if(r==maze.length-1 && c== maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c]==false){
            return;
        }
        if(r<maze.length-1){
            pathWithObstacles(p+'D',maze,r+1, c);
        }
        if(c<maze[0].length-1){
            pathWithObstacles(p+'R', maze,r, c+1);
        }




    }


}
