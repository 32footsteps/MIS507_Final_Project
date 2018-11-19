public class ScoreThrees implements ScoreProcessor{
  private static ScoreThrees instance;
  private int num=0;

  public static ScoreThrees getInstance(){
    if(instance==null){return new ScoreThrees();}
    return instance;
  }

  public ScoreThrees(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    for (int v:i){
      if(v==3)num+=v;
    }
    s.setThrees(num);
  }
}
