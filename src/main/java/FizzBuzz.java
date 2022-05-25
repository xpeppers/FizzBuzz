public class FizzBuzz {
    public String say(int number) {
        if (isMultipleOf3(number)) return "Fizz";
        return String.valueOf(number);
    }

    private boolean isMultipleOf3(int number) {
        return number % 3 == 0;
    }
}
