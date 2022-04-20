import java.util.*;
public class DiceWithNormal implements Dice{
    public DiceWithNormal(){

    }
    public int throwDice(){
        Random rand=new Random();
        return rand.nextInt(6)+1;
    }
    
}
