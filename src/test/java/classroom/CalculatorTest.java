package classroom;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class CalculatorTest {

   Calculator casio = new Calculator( "V2022");

   @Test
   public void sumMethodTest() {
       log.info("Testing sum method");
       log.debug("Testing sum method");
//     int result = casio.sum(200,50);
//      System.out.println(result);
       assertEquals(250, casio.sum(200, 50));
   }

   @Test
    public void subtractMethodTest() {
       assertEquals(250,casio.sum( 200, 50));
   }

   @Test
    public void multiplyMethodTest() {
       assertEquals(250,casio.multiply( 25, 10));
   }

   @Test
    public void divideMethodTest() {
       assertEquals(250, casio.divide(1000, 4));
   }

   @Test
    public void squaredMethodTest() {
       assertEquals(100, casio.squared(10));
   }

   @Test
    public void objectNameTest() {
       assertEquals("V2022",casio.getModelName(),"Model name is not correct");
   }


}
