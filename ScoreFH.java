public class ScoreFH implements ScoreProcessor{
  private static ScoreFH instance;
  private int num=0;

  public static ScoreFH getInstance(){
    if(instance==null){return new ScoreFH();}
    return instance;
  }

  public ScoreFH(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    s.setFH(25);
  }
}
