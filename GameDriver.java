import java.util.*;
public class GameDriver{
    public static void main(String [] args){
        int np=3;
        Player first=new Player("first",1);
        Player second=new Player("second",2);
        Player third=new Player("third",3);
        List<Player>players=new LinkedList<>();
        players.add(first);
        players.add(second);
        players.add(third);
        List<Jumper>snakeandladders=new ArrayList<Jumper>();
        snakeandladders.add(new Ladder(5,45));
        snakeandladders.add(new Ladder(15,85));
        snakeandladders.add(new Snake(55,23));
        snakeandladders.add(new Snake(98,37));
        snakeandladders.add(new Snake(93,16));
        snakeandladders.add(new Ladder(36,79));
        snakeandladders.add(new Ladder(16,48));
        snakeandladders.add(new Snake(65,3));
        snakeandladders.add(new Ladder(68,99));
        snakeandladders.add(new Snake(75,22));
        Board board=new GameBoard(100,snakeandladders);
        while(!(np<1))
        {
            Dice dice=new DiceWithNormal();
            SnakesLaddersGame game=new SnakesLaddersGame(board, players, dice);
            Player winner=game.startGame();
            for(Player player:players){
                System.out.println(player.getName()+":"+player.getPath());
                if(player.getName().equals(winner.getName())){
                    players.remove(player);
                }
            }
            if(np==1)
                System.out.println("Oops! "+winner.getName()+" has lost the game...");
            else    
                System.out.println("Hurray! "+winner.getName()+" has won the game!!!");
            np--;
        }


        

        

    }
}