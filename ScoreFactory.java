public class ScoreFactory{
  public ScoreProcessor getScore(int i){
    switch(i){
      case(1):
        return new ScoreOnes();
      case(2):
        return new ScoreTwos();
      case(3):
        return new ScoreThrees();
      case(4):
        return new ScoreFours();
      case(5):
        return new ScoreFives();
      case(6):
        return new ScoreSixes();
      case(7):
        return new ScoreToak();
      case(8):
        return new ScoreFoak();
      case(9):
        return new ScoreFH();
      case(10):
        return new ScoreSS();
      case(11):
        return new ScoreLS();
      case(12):
        return new ScoreY();
      case(13):
        return new ScoreC();
    }
    return null;
  }
}
