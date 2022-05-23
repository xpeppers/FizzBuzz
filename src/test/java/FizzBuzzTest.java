import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class FizzBuzzTest {

    @Test
    void plain_numbers_case() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.say(1);
        assertThat(result).isEqualTo("1");
    }
}
