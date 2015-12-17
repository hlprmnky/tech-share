package tech_share;

public class FizzBuzz {

    public String fizzBuzz(int number) {
        if (number % 15 == 0) {
            return "fizzbuzz";
        } else if (number % 3 == 0) {
            return "fizz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else {
            return String.valueOf(number);
        }
    }

    public static void main(String... args) {
        FizzBuzz fb = new FizzBuzz();
        for(int i = 1; i < 101; i++) {
            System.out.println(fb.fizzBuzz(i));

        }
    }
}
