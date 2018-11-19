public class ScoreSixes implements ScoreProcessor{
  private static ScoreSixes instance;
  private int num=0;

  public static ScoreSixes getInstance(){
    if(instance==null){return new ScoreSixes();}
    return instance;
  }

  public ScoreSixes(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    for (int v:i){
      if(v==6)num+=v;
    }
    s.setSixes(num);
  }
}
