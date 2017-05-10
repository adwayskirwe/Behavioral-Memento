
public class Client {
    public static void main(String[]args){
        Originator orig=new Originator();
        Caretaker care=new Caretaker();
        orig.setState("State 1");
        Memento mem=orig.saveStateToMemento();
        care.add(mem);

        orig.setState("State 2");
        mem=orig.saveStateToMemento();
        care.add(mem);

        orig.setState("State 3");
        mem=orig.saveStateToMemento();
        care.add(mem);

        mem=care.get(1);
        orig.getStateFromMemento(mem);
        System.out.println(orig.getState());
    }
}
