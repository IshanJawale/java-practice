import pack.Addition;
import pack.Subtraction;
// OR use: import pack.*;
public class Use {
    public static void main(String[] args) {
        Addition obj = new Addition(10.23, 45.67);
        Subtraction obj_ = new Subtraction(23.45, 34.5);
        obj.sum();
        obj_.sub();
    }
}
