import io.ale.fizzbuzz.rule.Buzz;
import io.ale.fizzbuzz.rule.Fizz;
import io.ale.fizzbuzz.rule.Plain;
import io.ale.fizzbuzz.rule.Rule;

import java.util.List;

import static java.util.List.of;

public class FizzBuzz {
    final static List<Rule> RULES = of(new io.ale.fizzbuzz.rule.FizzBuzz(), new Fizz(), new Buzz(), new Plain());

    public String say(int number) {
        return RULES
                .stream()
                .filter(rule -> rule.match(number))
                .findFirst().map(Rule::say).get();
    }
}
