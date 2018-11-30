public class ScoreSixes implements ScoreProcessor{
  private int num=0;

  public ScoreSixes(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    for (int v:i){
      if(v==6)num+=v;
    }
    s.setSixes(num);
  }
}
