public class ScoreY implements ScoreProcessor{
  private static ScoreY instance;
  private int ttl=0;

  public static ScoreY getInstance(){
    if(instance==null){return new ScoreY();}
    return instance;
  }

  public ScoreY(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    for(int v:i){
      ttl+=v;
    }
    s.setY(ttl);
  }
}
