import java.util.*;

public class Dice {
  private static Dice instance;
  private Random r=new Random();
  int v=0;

  public static Dice getInstance(){
    if(instance==null){return new Dice();}
    return instance;
  }

  public Dice(){this.setValue();}
  public void setValue(){this.v=1+r.nextInt(6);}
  public int getValue(){return v;}
}
