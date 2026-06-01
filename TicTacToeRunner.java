import java.util.Scanner;

public class TicTacToeRunner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to Tic Tac Toe!\n");
        
        TicTacToe game = new TicTacToe();
        
        while (!game.checkWin() && game.getTurn() < 9) { 
            game.printBoard();
            
            System.out.println("Enter Your Row Pick: ");
            int row = input.nextInt();
            
            System.out.println("Enter Your Col Pick: ");
            int col = input.nextInt();
            
            if (game.pickLocation(row, col)) {
                game.takeTurn(row, col);
            }
            else {
                System.out.println("That space is taken, or you entered an invalid row/col");
            }
    }
    game.printBoard();
    
    if (game.checkWin()) {
        if (game.getTurn()%2==1) {
            System.out.println("X wins!");
        }
        else {
            System.out.println("O wins!");
        }
    }
    else {
        System.out.println("The game has tied!");
    }
    }
}
