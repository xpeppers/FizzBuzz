public class FizzBuzz {
    public String say(int number) {
        if(isMultipleOf(number, 3)) {
          return "Fizz";
        }
        if(isMultipleOf(number, 5)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private boolean isMultipleOf(int input, int number) {
        return input % number == 0;
    }
}
