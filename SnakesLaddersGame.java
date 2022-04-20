import java.util.*;
public class SnakesLaddersGame {
    private Board board;
    private List<Player>players;
    private Dice dice;
    public SnakesLaddersGame(Board board,List<Player>players,Dice dice){
        this.board=board;
        this.players=players;
        this.dice=dice;
    }
    public Player startGame(){
        while(true){
            Player curr=players.remove(0);
            int rolledValue=dice.throwDice();
            curr.setLoc(curr.getLoc()+rolledValue);
            if(curr.getLoc()>board.getLastVal()){
                curr.setLoc(curr.getLoc()-rolledValue);
            }
            int val=board.getNextLoc(curr.getLoc());
            if(val!=curr.getLoc()){
                curr.getPath().add(curr.getLoc());
                curr.setLoc(val);
            }
            curr.getPath().add(curr.getLoc());
            players.add(curr);
            if(curr.getLoc()==board.getLastVal()){
                return curr;
            }
        }
    }
    
}
