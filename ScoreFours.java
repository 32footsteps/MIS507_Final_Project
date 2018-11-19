public class ScoreFours implements ScoreProcessor{
  private static ScoreFours instance;
  private int num=0;

  public static ScoreFours getInstance(){
    if(instance==null){return new ScoreFours();}
    return instance;
  }

  public ScoreFours(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    for (int v:i){
      if(v==4)num+=v;
    }
    s.setFours(num);
  }
}
