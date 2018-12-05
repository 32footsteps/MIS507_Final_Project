import java.util.*;

public class Subject {

    List<Observer> observers=new ArrayList<Observer>();
    private int state;

    public Subject(){}

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public int getState() {
        return state;
    }

    public void attach(Observer o){
        this.observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public void notifyObservers(){
        for(Observer o: observers)
            o.update();
    }
}
