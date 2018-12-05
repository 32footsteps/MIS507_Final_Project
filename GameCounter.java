public class GameCounter extends Observer{
  public GameCounter(Subject sub){
    this.subject=sub;
    this.subject.attach(this);
  }

  public int update() {
    return this.totalTurnCount();
  }

  public int totalTurnCount(){
     return subject.getState()+1;
  }
}
