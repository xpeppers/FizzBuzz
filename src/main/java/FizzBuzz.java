public class FizzBuzz {

    public static String say(int number) {
        if (isMultipleOfThree(number))
            return "Fizz";
        return String.valueOf(number);
    }

    private static boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }
}
