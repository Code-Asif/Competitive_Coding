class Sudoku
{
    public static boolean isSafe(int grid[][],int row,int col,int number)
    {
        //for column
        for(int i=0;i<9;i++)
        {
            if(grid[i][col]==number)
            {
                return false;
            }
        }
        //for row
        for(int j=0;j<9;j++)
        {
            if(grid[row][j]==number)
            {
                return false;
            }
        }
        //Grid 
        int sr=3*(row/3);
        int sc=3*(col/3);
        for(int i=sr;i<sr+3;i++)
        {
            for(int j=sc;j<sc+3;j++)
            {
                if(grid[i][j]==number)
                {
                    return false;
                }
            }
        }
        return true;
       
    }
    static boolean helper(int grid[][],int row,int col)
    {
        //base case
        if(row==9)
        {
            return true;
        }
        //Recursion
        int nextRow=row;
        int nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        if(grid[row][col]!=0)
        {
            return helper(grid,nextRow,nextCol);
        }
        for(int number=1;number<=9;number++)
        {
            if(isSafe(grid,row,col,number))
            {
                grid[row][col]=number;
                if(helper(grid,nextRow,nextCol))
                {
                    return true;
                }
                grid[row][col]=0;
            }
        }
        return false;
    }
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][])
    {
        // add your code here
        return helper(grid,0,0);
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        // add your code here
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(grid[i][j]+" ");
            }
        }
    }
}