public class ScoreFoak implements ScoreProcessor{
  private static ScoreFoak instance;
  private int ttl=0;

  public static ScoreFoak getInstance(){
    if(instance==null){return new ScoreFoak();}
    return instance;
  }

  public ScoreFoak(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    int num=0;
    int li=i[0];
    for(int x=0;x<i.length;x++){
      if(i[x]==li){num++;}
      li=i[x];
    }
    if(num>3){
      for (int v:i){
        ttl+=v;
      }
    }
    s.setFoak(ttl);
  }
}
