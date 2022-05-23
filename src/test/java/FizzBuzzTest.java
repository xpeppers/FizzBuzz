import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void plain_numbers_case() {
        assertThat(fizzBuzz.say(1)).isEqualTo("1");
        assertThat(fizzBuzz.say(2)).isEqualTo("2");
    }

    @Test
    void multiple_of_3(){
        assertThat(fizzBuzz.say(3)).isEqualTo("Fizz");
        assertThat(fizzBuzz.say(6)).isEqualTo("Fizz");
    }

    @Test
    void multiple_of_5(){
        assertThat(fizzBuzz.say(5)).isEqualTo("Buzz");
        assertThat(fizzBuzz.say(10)).isEqualTo("Buzz");
    }

    @Test
    void number_is_multiple_of_3_and_5() {
        assertThat(fizzBuzz.say(15)).isEqualTo("FizzBuzz");
    }

}
