import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class FizzBuzzTest {
    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void firstNumber() {
        String output = fizzBuzz.say(1);

        assertThat(output).isEqualTo("1");
    }
    @Test
    void secondNumber() {
        String output = fizzBuzz.say(2);

        assertThat(output).isEqualTo("2");
    }

    @Test
    void numberIsMultipleOf3() {
        String output = fizzBuzz.say(3);

        assertThat(output).isEqualTo("Fizz");
    }


}
