package arithmetic_expressions_ufu;

public class Division implements Expression {
    private final Expression numerator;
    private final Expression denominator;

    Division(Expression numerator, Expression denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public int reduce() {
        return numerator.reduce() / denominator.reduce();
    }
}
