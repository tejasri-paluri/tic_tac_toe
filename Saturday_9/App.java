import board.Board;
import player.Player;
import game.Game;
import java.util.*;
public class App {
    public App()
    {

    }
    public static void main(String[] args) throws Exception
    {
        Board b = new Board(4,'*');
        
        Player p1 = new Player();
       // Scanner scn = new Scanner(System.in);
       // System.out.println("enter the name and symbol of palyer 1 and player 2");
       // String name= scn.nextLine();
       // char symbol=scn.nextLine().charAt(0);
       p1.setNameAndSymbol("teju",'X');
       p1.getPlayerNameAndSymbol();
        Player p2= new Player();
        //String name1= scn.nextLine();
        //char symbol1=scn.nextLine().charAt(0);
        p2.setNameAndSymbol("mouni", 'O');
        p2.getPlayerNameAndSymbol();
        //p1.getPlayerNameAndSymbol();
        //p2.getPlayerNameAndSymbol();

        //p.setPlayerDetails("teja",20,"darsipparu","teja@124","53453456",'@');
        //p.getPlayerDetails();
        //p.changeSymbol('0');
        //p.getPlayerDetails();
        //p.getPlayerNameAndSymbol();
        //b.printBoard();
        Game game = new Game(new Player[] {p1,p2},b);
        game.play();

    }
    
}
