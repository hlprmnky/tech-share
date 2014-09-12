package tech_share;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestFizzBuzz {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void test_returns_a_number() throws Exception {
        assertEquals("Should return a String-ified numeric argument", "1", fizzBuzz.fizzBuzz(1));

    }

    @Test
    public void test_returns_fizz() throws Exception {
        assertEquals("Should return 'fizz' when argument is divisible by 3", "fizz", fizzBuzz.fizzBuzz(6));
    }

    @Test
    public void test_returns_buzz() throws Exception {
        assertEquals("Should return 'buzz' when argument is divisible by 5", "buzz", fizzBuzz.fizzBuzz(20));
    }

    @Test
    public void test_returns_fizzbuzz() throws Exception {
        assertEquals("Should return 'fizzbuzz' when argument is divisible by 15", "fizzbuzz", fizzBuzz.fizzBuzz(30));
    }
}
