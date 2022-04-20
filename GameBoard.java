import java.util.*;
public class GameBoard implements Board {
    private int lastVal;
    private List<Jumper>jumps;
    public GameBoard(int lastVal,List<Jumper>jumps){
        this.lastVal=lastVal;
        this.jumps=new ArrayList<Jumper>();
        //this.jumps=jumps;
    }
    public List<Jumper> getJumps(){
        return jumps;
    }
    public int getLastVal(){
        return lastVal;
    }
    public int getNextLoc(int loc){
        int preVal;
        int finalVal=loc;
        do{
            preVal=finalVal;
            for(Jumper location:jumps){
                if(preVal==location.getStart()){
                    finalVal=location.getEnd();
                }

            }
        }while(finalVal!=preVal);
        return finalVal;
    }
    
}
