/**
 * Implements the TextBlock interface and creates a truncated text block.
 * 
 * @author Connor Heagy
 * @author Vincent Yao
 */
public class Truncated implements TextBlock{

  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  TextBlock text;

  int maxWidth;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * 
   * Builds a Textblock where the contents within the block are truncated
   */
  public Truncated(TextBlock text, int maxWidth) {
    this.text = text;
    this.maxWidth = maxWidth;
  } // Truncated(text maxwidth)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get one row from the block.
   *
   * @pre 0 <= i < this.height()
   * @exception Exception if the precondition is not met
   */
  public String row(int i) throws Exception{
    return this.text.row(i).substring(0, this.maxWidth);
  } // row(int)

  /**
   * Determine how many rows are in the block.
   */
  public int height() {
    return 1;
  } // height()

  /**
   * Determine how many columns are in the block.
   */
  public int width() {
    return this.maxWidth;
  } // width()
} // class Truncated
