public class ScoreOnes implements ScoreProcessor{
  private int num=0;

  public ScoreOnes(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    for (int v:i){
      if(v==1)num+=v;
    }
    s.setOnes(num);
  }
}
