public class ScoreC implements ScoreProcessor{
  private static ScoreC instance;
  private int ttl=0;

  public static ScoreC getInstance(){
    if(instance==null){return new ScoreC();}
    return instance;
  }

  public ScoreC(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    for(int v:i){
      ttl+=v;
    }
    s.setC(ttl);
  }
}
