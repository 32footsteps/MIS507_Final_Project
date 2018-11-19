public class ScoreOnes implements ScoreProcessor{
  private static ScoreOnes instance;
  private int num=0;

  public static ScoreOnes getInstance(){
    if(instance==null){return new ScoreOnes();}
    return instance;
  }

  public ScoreOnes(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    for (int v:i){
      if(v==1)num+=v;
    }
    s.setOnes(num);
  }
}
