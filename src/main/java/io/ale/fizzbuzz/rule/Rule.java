package io.ale.fizzbuzz.rule;

public interface Rule {
    boolean match(int number);
    String say();
}
