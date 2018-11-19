public class ScoreSS implements ScoreProcessor{
  private static ScoreSS instance;
  private int num=0;

  public static ScoreSS getInstance(){
    if(instance==null){return new ScoreSS();}
    return instance;
  }

  public ScoreSS(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    s.setSS(30);
  }
}
