/**
 * Implements the TextBlock interface and creates a left justified text block 
 * 
 * @author Connor Heagy
 * @author Vincent Yao
 */
public class LeftJustified implements TextBlock{

  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  
  TextBlock text;

  int width;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Build a new line with text that is left justified.
   */
  public LeftJustified(TextBlock text, int width) {
    this.text = text;
    this.width = width;
  } // LeftJustified(t1, t2)

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
    //Determines the padding on the right
    String padright = TBUtils.spaces(pad); 
    return this.text.row(i) + padright;
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
} // class LeftJustified
