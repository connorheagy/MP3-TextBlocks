/**
 * Implements the TextBlock interface and creates a right justified text block. 
 * 
 * @author Connor Heagy
 * @author Vincent Yao
 */
public class RightJustified implements TextBlock{

  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  TextBlock text;

  int width;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * 
   * Builds a Textblock where the text is right justified
   */
  public RightJustified(TextBlock text, int width) {
    this.text = text;
    this.width = width;
  } // RightJustified(text, width)

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
    int pad = this.width - this.text.row(i).length();
    //Determine padding
    String padleft = TBUtils.spaces(pad);
    return padleft + this.text.row(i);
  } // row(int i)

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
    return this.width;
  } // width()
}