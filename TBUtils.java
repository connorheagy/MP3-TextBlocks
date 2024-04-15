import java.io.PrintWriter;

/**
 * Utilities for TextBlocks.
 * 
 * @author Samuel A. Rebelsky
 * @author Connor Heagy
 * @author Vincent Yao 
 */
public class TBUtils {
  // +--------------+------------------------------------------------------
  // | Class Fields |
  // +--------------+

  /**
   * A really big sequence of dashes. This sequence may grow as the program operates.
   */
  static String lotsOfDashes = "--";

  /**
   * A really big sequence of spaces. This sequence may grow as the program operates.
   */
  static String lotsOfSpaces = "  ";

  // +----------------+----------------------------------------------------
  // | Static Methods |
  // +----------------+

  /**
   * Build a sequence of dashes of a specified length.
   */
  static String dashes(int len) {
    // Note: This strategy probably represents an overkill in
    // attempts at efficiency.
    // Make sure the collection of dashes is big enough
    while (lotsOfDashes.length() < len) {
      lotsOfDashes = lotsOfDashes.concat(lotsOfDashes);
    } // while
    // Extract an appropriate length substring
    return lotsOfDashes.substring(0, len);
  } // dashes(int)

  /**
   * Print a TextBlock to the specified destination.
   */
  public static void print(PrintWriter pen, TextBlock block) {
    for (int i = 0; i < block.height(); i++) {
      // Even though we only call block.row with a valid i,
      // we need to put the call in a try/catch block.
      try {
        pen.println(block.row(i));
      } catch (Exception e) {
        pen.println();
      } // catch (Exception)
    } // for
  } // print(PrintWriter, TextBlock)

  /**
   * Build a sequence of spaces of a specified length.
   */
  static String spaces(int len) {
    // As with dashes, this is probably overkill.
    // Make sure the collection of dashes is big enough
    while (lotsOfSpaces.length() < len) {
      lotsOfSpaces = lotsOfSpaces.concat(lotsOfSpaces);
    } // while
    // Extract an appropriate length substring
    return lotsOfSpaces.substring(0, len);
  } // spaces(int)

  /**
   * @param t1
   * @param t2
   * Returns true if two textblocks are equal if they contain the same lines, false otherwise.
   */
  static boolean equal(TextBlock t1, TextBlock t2) {
    if (t1.height() != t2.height() || t1.width() != t2.width()) {
      return false;
  } // if
    for (int i = 0; i < t1.height(); i++) {
      try {
        if (!t1.row(i).equals(t2.row(i))) {
          return false;
        } // if 
      } catch (Exception e) {
        return false;
      } // catch (Exception)
  } // for
  return true;
} // equal(t1, t2)

  /**
   * 
   * @param t1
   * @param t2
   * returns true if two textblocks are equal if they were built in the same way, false otherwise.
   */
  static boolean eqv(TextBlock t1, TextBlock t2) {
    if (t1 instanceof TextBlock && t2 instanceof TextBlock) {
        return equal(t1, t2);
    } // if 
    return false;
  } // eqv(t1, t2)

  /**
   * 
   * @param t1
   * @param t2
   * returns true if two textblocks are equal if they occupy the same memory location, false otherwise.
   */
  static boolean eq(TextBlock t1, TextBlock t2){
    return t1 == t2;
  } // eq(t1, t2)
} // class TBUtils
