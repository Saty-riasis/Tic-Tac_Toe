import java.util.Scanner;

class main{
    public static void main(String[] args){
    home hm = new home();
    }
}
class input{
    input(){Scanner scan = new Scanner(System.in);}
}
interface HighScore{
    //public static int[] score_arr; 
    int setScore(int score);
    int getScore();
}
interface TicTacToe{
    public void checkCondition();
    public void printResults();
    //private boolean checkMove(int position);
    public void makeMove(int position);
}
class GameScreen {//implements TicTacToe,HighScore{
    
    GameScreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        
        board brd = new board();
    //public static boolean gameStatus = false;
    while(true){
       brd.builder();
       for(int turn = 1;turn<=9;turn++){
        int ch = scan.nextInt();  
        if(turn == 1){
            init it = new board.init(); 
        }
        if (turn % 2 == 0)
            {
                switch (ch){
                    case 1:
                    grid[0][0] = 'X';
                    break;
                    case 2:
                    grid[0][1] = 'X';
                    break;
                    case 3:
                    grid[0][2] = 'X';
                    break;
                }
            }
            else
            {
                

            }
       }
    }
    }
}

class home extends input {
    home(){

        System.out.println("\033[0;1m" + "TIC-TAC-TOE");
        System.out.println("1 : Play Game");
        System.out.println("2 : HighScore");
		System.out.println("3 : Settings");
	    
		System.out.println("Enter your choice::");
        switch(ch){
            case 1:
            GameScreen game = new GameScreen();
            break;
            case 2:
            break;
            case 3:
            break;
        }
}
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
