import org.junit.Test;
import org.junit.*;
import com.codenvy.example.entity.CalculatorOfSquareRoot;


public class CalculatorOfSquareRootTest {
  
  @Test
  public void findFirstRootTest()  {
    CalculatorOfSquareRoot c = new CalculatorOfSquareRoot();
    c.setA(1);
    c.setB(-2);
    c.setC(-3);
    Assert.assertEquals(c.solveRoot1(), 3.0, 0.001);
  }
  
  @Test
  public void findSecondRootTest()  {
    CalculatorOfSquareRoot c = new CalculatorOfSquareRoot();
    c.setA(1);
    c.setB(-2);
    c.setC(-3);
    Assert.assertEquals(c.solveRoot2(), -1.0, 0.001);
  }
}
