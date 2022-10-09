import java.util.Scanner;


class main{
    public static void main(String[] args){
    home hm = new home();
    }
}
class input{
  Scanner scan = new Scanner(System.in);
}
interface HighScore{
    public static int[] score_arr; 
    int setScore(int score);
    int getScore();
}
interface TicTacToe{
    private int turn;
    public void checkCondition();
    public void printResults();
    private boolean checkMove(int position);
    public void makeMove(int position);
}
class GameScreen implements TicTacToe{
    board grid = new board();
    private boolean gameStatus = false;
    while(private boolean gameStatus == false){

    }
}

class home extends input {
    home(){

        System.out.println("\033[0;1m" + "TIC-TAC-TOE");
        System.out.println("1 : Play Game");
        System.out.println("2 : HighScore");
		System.out.println("3 : Settings");
	    
		System.out.println("Enter your choice::");
		String ch = scan.nextInt();
        switch(ch){
            case 1:

            break;
            case 2:
            break;
            case 3:
            break;
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
