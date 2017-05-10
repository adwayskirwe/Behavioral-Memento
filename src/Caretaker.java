import java.util.ArrayList;
import java.util.List;

public class Caretaker {
        List<Memento > mementoList = new ArrayList<Memento>();

    public void add(Memento mem){
        mementoList.add(mem);
    }
    public Memento get(int n){
        return mementoList.get(n);
    }

}


