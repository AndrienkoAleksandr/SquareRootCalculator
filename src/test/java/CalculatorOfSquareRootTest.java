import org.junit.Test;
import org.junit.*;
import com.codenvy.example.entity.CalculatorOfSquareRoot;
import com.codenvy.example.exception.ComplexRootException;


public class CalculatorOfSquareRootTest {
  
  @Test
  public void findFirstRootTest() throws ComplexRootException  {
    CalculatorOfSquareRoot c = new CalculatorOfSquareRoot();
    c.setA(1);
    c.setB(-2);
    c.setC(-3);
    Assert.assertEquals(c.solveRoot1(), 3.0, 0.001);
  }
  
  @Test
  public void findSecondRootTest() throws ComplexRootException  {
    CalculatorOfSquareRoot c = new CalculatorOfSquareRoot();
    c.setA(1);
    c.setB(-2);
    c.setC(-3);
    Assert.assertEquals(c.solveRoot2(), -1.0, 0.001);
  }
  
  @Test
  public void findThirdRootTest() throws Exception{
    CalculatorOfSquareRoot c = new CalculatorOfSquareRoot();
    c.setA(1);
    c.setB(1);
    c.setC(1);
    double result =c.solveRoot2();
    Assert.assertTrue(Double.isNaN(result));
  }
}
