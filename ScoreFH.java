public class ScoreFH implements ScoreProcessor{
  private int num=0;

  public ScoreFH(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    s.setFH(25);
  }
}
