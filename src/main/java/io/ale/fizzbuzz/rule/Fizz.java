package io.ale.fizzbuzz.rule;

public class Fizz implements Rule {
    @Override
    public boolean match(int number) {
        return number % 3 == 0;
    }

    @Override
    public String say() {
        return "Fizz";
    }
}
