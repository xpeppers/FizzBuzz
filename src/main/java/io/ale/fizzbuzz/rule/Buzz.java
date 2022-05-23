package io.ale.fizzbuzz.rule;

public class Buzz implements Rule {
    @Override
    public boolean match(int number) {
        return number % 5 == 0;
    }

    @Override
    public String say() {
        return "Buzz";
    }
}
