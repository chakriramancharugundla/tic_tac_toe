package tic_tac_toe;
import java.util.*;
public class game {
	 public static void main(String[] args)
	    {
	   
	        char[][] board=new char[3][3];
	        for(int row=0;row<board.length;row++)
	        {
	            for(int col=0;col<board[row].length;col++)
	            {
	                board[row][col]=' ';
	            }
	        }


	        Scanner sc=new Scanner(System.in);
	        boolean gameDone=false;
	        char player='X';

	        while(!gameDone)
	        {
	            printBoard(board);
	            System.out.println("Player "+player+" Enter Your Insertion row(0,1,2) and column(0,1,2) number :");
	            int row=sc.nextInt();
	            int col=sc.nextInt();
	            if(board[row][col]==' ')
	            {
	                board[row][col]=player;
	                gameDone=checkWin(board,player);
	                if(gameDone)
	                {
	                    System.out.println("player "+player+" won the match");
	                }
	                else
	                {
	                    player=(player=='X')?'O':'X';
	                }

	            }
	            else{
	                System.out.println("Invalid row and column selection");
	            }
	        }
	    }
	    public static void printBoard(char[][] board)
	    {
	      
	        for(int row=0;row<board.length;row++)
	        {
	            for(int col=0;col<board[row].length;col++)
	            {
	                
	                System.out.print(board[row][col]+"|");
	            }
	           
	            System.out.println();
	        }
	        
	        

	    }
	    public static boolean checkWin(char[][] board,char player)
	    {
	        for(int row=0;row<board.length;row++)
	        {
	            if(board[row][0]==player&&board[row][1]==player&&board[row][2]==player)
	            {
	                return true;
	            }

	        }
	        for(int col=0;col<board[0].length;col++)
	        {
	            if(board[0][col]==player&&board[1][col]==player&&board[2][col]==player)
	            {
	                return true;
	            }
	        }
	        if(board[0][0]==player&&board[1][1]==player&&board[2][2]==player)
	        {
	            return true;
	        }
	        if(board[0][2]==player&&board[1][1]==player&&board[2][0]==player)
	        {
	            return true;
	        }

	        return false;
	    }

}
