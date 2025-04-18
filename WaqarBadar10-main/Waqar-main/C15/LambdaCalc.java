package C15;

// Problem: Implement calculator using Lambda expressions.

interface Operation { int op(int a, int b); }

public class LambdaCalc {
    public static void main(String[] args) {
        Operation add = (a, b) -> a + b;
        Operation mul = (a, b) -> a * b;
        System.out.println("Sum: " + add.op(3, 4));
        System.out.println("Mul: " + mul.op(3, 4));
    }
}
/* Output:
Sum: 7
Mul: 12
*/
