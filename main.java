import java.util.Scanner;

class main{
    public static void main(String[] args){
    home hm = new home();
    }
}

public class board {
    public static char[][] grid = new char[3][3]; // grid to make the board
    // a nested class init to fill the grid with position numbers 
       board(){
        //public static char[][] grid = new char[3][3];
        int Iterator=1;
       for (int i = 0; i<3; i++) {
         for (int j = 0; j<3; j++){
            char val=Integer.toString(Iterator).charAt(0);
            grid[i][j]=val;
            Iterator++;
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

class GameScreen {
    
    GameScreen(){ 
        board brd = new board();
    //public static boolean gameStatus = false;
     Scanner scan = new Scanner(System.in);
    while(true){
       
       for(int turn = 1;turn<=9;turn++){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        brd.builder();
        if (turn % 2 == 0)
            { 
                System.out.print("\nENTER THE POSITION (PLAYER 2) : ");
                int ch = scan.nextInt();  
                switch (ch){
                    case 1:
                    brd.grid[0][0] = 'X';
                    break;
                    case 2:
                    brd.grid[0][1] = 'X';
                    break;
                    case 3:
                    brd.grid[0][2] = 'X';
                    break;
                    case 4:
                    brd.grid[1][0] = 'X';
                    break;
                    case 5:
                    brd.grid[1][1] = 'X';
                    break;
                    case 6:
                    brd.grid[1][2] = 'X';
                    break;
                    case 7:
                    brd.grid[2][0] = 'X';
                    break;
                    case 8:
                    brd.grid[2][1] = 'X';
                    break;
                    case 9:
                    brd.grid[2][2] = 'X';
                    break;
                }
            }
            else
            {   System.out.print("\nENTER THE POSITION (PLAYER 1) : ");
                int ch = scan.nextInt();  
                 switch (ch){
                    case 1:
                    brd.grid[0][0] = 'O';
                    break;
                    case 2:
                    brd.grid[0][1] = 'O';
                    break;
                    case 3:
                    brd.grid[0][2] = 'O';
                    break;
                    case 4:
                    brd.grid[1][0] = 'O';
                    break;
                    case 5:
                    brd.grid[1][1] = 'O';
                    break;
                    case 6:
                    brd.grid[1][2] = 'O';
                    break;
                    case 7:
                    brd.grid[2][0] = 'O';
                    break;
                    case 8:
                    brd.grid[2][1] = 'O';
                    break;
                    case 9:
                    brd.grid[2][2] = 'O';
                    break;
                }

            }
       }
    }
    }
}

class home{
    home(){

        System.out.println("\033[0;1m" + "TIC-TAC-TOE");
        System.out.println("1 : Play Game");
        System.out.println("2 : HighScore");
		System.out.println("3 : Settings");
	    
		System.out.println("Enter your choice::");
        Scanner scan = new Scanner(System.in);
        int ch = scan.nextInt();
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

