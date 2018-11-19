public class ScoreLS implements ScoreProcessor{
  private static ScoreLS instance;
  private int num=0;

  public static ScoreLS getInstance(){
    if(instance==null){return new ScoreLS();}
    return instance;
  }

  public ScoreLS(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    s.setLS(40);
  }
}
