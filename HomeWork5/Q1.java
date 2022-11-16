package HomeWork5;
public class Q1 {
    private int value;
public Q1()
    {value = 0;}
    public void click() {
        value = value + 1;
    }
    public int getValue() {
        return value;
    }
    public void resert() {value = 0;}
    public void undo() { value = value - 1; }
}
