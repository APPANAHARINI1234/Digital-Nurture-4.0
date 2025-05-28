package program_8;

public class OpPrecedence {
    public static void main(String[] args) {
        System.out.println(10*3+5);
        // precedence will be in the order:
        // you  -> unary
        // a (arithemetic) s (shift) k(comparision)
        // electric (equality)
        // bill binary
        // short -> && ||
        // circuilt -> conditional
        // A -> assignment
    }
}
