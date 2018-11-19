public class ScoreFives implements ScoreProcessor{
  private static ScoreFives instance;
  private int num=0;

  public static ScoreFives getInstance(){
    if(instance==null){return new ScoreFives();}
    return instance;
  }

  public ScoreFives(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    for (int v:i){
      if(v==5)num+=v;
    }
    s.setFives(num);
  }
}
