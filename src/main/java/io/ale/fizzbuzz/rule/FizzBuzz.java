package io.ale.fizzbuzz.rule;

public class FizzBuzz implements Rule{
    @Override
    public boolean match(int number) {
        return number % 5 ==0 && number % 3 == 0;
    }

    @Override
    public String say() {
        return "FizzBuzz";
    }
}
