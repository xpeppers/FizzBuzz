public class FizzBuzz {

    public static String say(int number) {
        if (isMultipleOfThree(number))
            return "Fizz";
        if(isMultipleOfFive(number))
            return "Buzz";
        return String.valueOf(number);
    }

    private static boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }

    private static boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }
}
