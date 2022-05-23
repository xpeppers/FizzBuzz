import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class FizzBuzzTest {

    @Test
    void plain_numbers_case() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThat(fizzBuzz.say(1)).isEqualTo("1");
        assertThat(fizzBuzz.say(2)).isEqualTo("2");
    }

}
