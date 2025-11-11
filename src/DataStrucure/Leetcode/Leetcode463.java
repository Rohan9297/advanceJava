package DataStrucure.Leetcode;

public class Leetcode463
{
    public static void main(String[] args) {
        int [][] grid={
//                {0,1,0,0},
//                {1,1,1,0},
//                {0,1,0,0},
//                {1,1,0,0}
        {1}
        };

        int result=islandPerimeter(grid,0);
        System.out.println(result);
    }

    public static int islandPerimeter(int[][] grid,int count) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                if(grid[i][j]==1){

                    if(i==0 || grid[i-1][j]==0 ){
                        count+=1;
                    }
                    if(j==0 || 0==grid[i][j-1]){
                        count+=1;
                    }

                    if(i== grid.length-1 || grid[i+1][j]==0){
                        count+=1;
                    }

                    if (j==grid[i].length-1|| grid[i][j+1]==0){
                        count+=1;
                    }
                }

            }
        }
            return count;
    }
}
