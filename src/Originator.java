import java.util.ArrayList;
import java.util.List;

public class Originator {
    String state;

    public void setState(String s){
        state=s;
    }
    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento mem){
        state=mem.getState();
    }
}
