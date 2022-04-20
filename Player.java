import java.util.*;
public class Player{
    private String name;
    private int id;
    private int loc=0;
    private List<Integer>path;
    public Player(String name,int id){
        this.name=name;
        this.id=id;
        this.path=new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getLoc(){
        return loc;
    }
    public List<Integer> getPath(){
        return path;
    }
    public void setLoc(int loc){
        this.loc=loc;
    }
}