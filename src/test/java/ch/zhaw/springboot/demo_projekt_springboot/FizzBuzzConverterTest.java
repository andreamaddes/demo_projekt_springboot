package ch.zhaw.springboot.demo_projekt_springboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzConverterTest {
    
    @Test
    public void fizzBuzzConverter1() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assertions.assertThat(fizzBuzz.convert(1)).isEqualTo("1");
    }

    @Test
    public void fizzBuzzConvertor2() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assertions.assertThat(fizzBuzz.convert(2)).isEqualTo("2");
    }

    @Test
    public void fizzBuzzConvertor3() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assertions.assertThat(fizzBuzz.convert(3)).isEqualTo("Fizz");
    }

    @Test
    public void fizzBuzzConvertorMultiplesOfThree() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assertions.assertThat(fizzBuzz.convert(6)).isEqualTo("Fizz");
    }

    @Test
    public void fizzBuzzConvertorMultiplesOfSeven() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assertions.assertThat(fizzBuzz.convert(7)).isEqualTo("Buzz");
    }

    @Test
    public void fizzBuzzConvertorMultiplesOfThreeAndSeven() {
        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assertions.assertThat(fizzBuzz.convert(14)).isNotEqualTo("FizzBuzz");
        Assertions.assertThat(fizzBuzz.convert(21)).isEqualTo("FizzBuzz");
        Assertions.assertThat(fizzBuzz.convert(42)).isEqualTo("FizzBuzz");
        Assertions.assertThat(fizzBuzz.convert(63)).isEqualTo("FizzBuzz");
    }
}
