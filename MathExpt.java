import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * A few simple experiments with our utilities.
 *
 * @author Samuel A. Rebelsky
 */
public class MathExpt {
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);

    // Print some square roots.
    for (int i = 2; i < 10; i++) {
      double root = MathUtils.squareRoot(i);
      pen.println("The square root of " + i + " seems to be " + root);
      pen.println(root + "^2 = " + (root * root));
      pen.println("The square root of " + i + " seems to be " + MathUtils.squareRoot(Integer.valueOf(i)));
      pen.println("The square root of " + i + " seems to be " + MathUtils.squareRoot(Float.valueOf(i)));
      pen.println("The square root of " + i + " seems to be " + MathUtils.squareRoot(BigInteger.valueOf(i)));
      pen.println("The square root of " + i + " seems to be " + MathUtils.squareRoot(BigDecimal.valueOf(i)));
      pen.println("The square root of " + i + " seems to be " + MathUtils.squareRoot(i));
      
    } // for i

    // We're done. Clean up.
    pen.close();
  } // main(String[])
} // class MathExpt
