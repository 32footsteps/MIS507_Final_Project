public class ScoreThrees implements ScoreProcessor{
  private int num=0;

  public ScoreThrees(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    for (int v:i){if(v==3)num+=v;}
    s.setThrees(num);
  }
}
