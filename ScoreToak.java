public class ScoreToak implements ScoreProcessor{
  private int ttl=0;
  private int num=0;
  public ScoreToak(){}

  @Override
  public void setScore(int[] i, Scorecard s){
    int li=i[0];
    for(int x=0;x<i.length;x++){
      if(i[x]==li){num++;}
      li=i[x];
    }
    if(num>2){
      for(int v:i){ttl+=v;}
    }
    s.setToak(ttl);
  }
}
