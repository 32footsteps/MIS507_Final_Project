public class ScoreTwos implements ScoreProcessor{
  private static ScoreTwos instance;
  private int num=0;

  public static ScoreTwos getInstance(){
    if(instance==null){return new ScoreTwos();}
    return instance;
  }

  public ScoreTwos(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    for (int v:i){
      if(v==2)num+=v;
    }
    s.setTwos(num);
  }
}
