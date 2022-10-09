class main{
    private boolean gameStatus = false;
    public static void main(String[] args){
      board.builder();
    }
}

class home {

}

class board {
    public static char[][] grid = new char[3][3]; // grid to make the board
    // a nested class init to fill the grid with position numbers 
    static class init {
       init(){
        int Iterator=1;
       for (int i = 0; i<3; i++) {
         for (int j = 0; j<3; j++){
            char val=Integer.toString(Iterator).charAt(0);
            grid[i][j]=val;
            Iterator++;
        }
       }
       }
    }
    
     public static void builder(){
        init i = new board.init();
        for (int row = 0; row < grid.length; row++)
        {   
            for (int column = 0; column < 3; column++)
            {   
                switch (column)
                {
                    case 0:
                        System.out.print(" " + grid[row][column] + " | ");
                        break;
                    case 1:
                        System.out.print(grid[row][column] + " | ");
                        break;
                    case 2:
                        System.out.println(grid[row][column]);
                        break;
                }
            }
            if (row < 2)
            {
                System.out.println("-----------");
            }
        }
    }
}
