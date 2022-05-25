import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class FizzBuzzTest {

    @Test
    void firstNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String output = fizzBuzz.say(1);
        assertThat(output).isEqualTo("1");
    }
}
