package arithmetic_expressions_ufu;

public class Multiplication implements Expression {
    private final Expression a;
    private final Expression b;


    public Multiplication(Expression a, Expression b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public int reduce() {
        return a.reduce() * b.reduce();
    }
}
