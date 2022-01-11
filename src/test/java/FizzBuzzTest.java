import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void when_it_receives_a_number_it_returns_itself_in_string() {
        assertEquals(FizzBuzz.say(1), "1");
    }

    @Test
    public void when_it_receives_a_multiple_of_three_it_returns_Fizz() {
        assertEquals(FizzBuzz.say(3), "Fizz");
        assertEquals(FizzBuzz.say(6), "Fizz");
        assertEquals(FizzBuzz.say(9), "Fizz");
    }

    @Test
    public void when_it_receives_a_multiple_of_five_it_returns_Buzz() {
        assertEquals(FizzBuzz.say(5), "Buzz");
        assertEquals(FizzBuzz.say(25), "Buzz");
        assertEquals(FizzBuzz.say(50), "Buzz");
    }
}
