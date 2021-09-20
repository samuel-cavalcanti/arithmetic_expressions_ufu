package arithmetic_expressions_ufu;

public class Number implements Expression {
    private final int number;

    public Number(int number) {
        this.number = number;

    }

    @Override
    public int reduce() {
        return this.number;
    }


}
