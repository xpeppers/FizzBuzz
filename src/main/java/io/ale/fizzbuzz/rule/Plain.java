package io.ale.fizzbuzz.rule;

public class Plain implements Rule{
    private Integer number;
    @Override
    public boolean match(int number) {
        this.number = number;
        return true;
    }

    @Override
    public String say() {
        return String.valueOf(number);
    }
}
