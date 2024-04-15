/**
 * Implements the TextBlock interface, creating a centered textblock. 
 * 
 * @author Connor Heagy
 * @author Vincent Yao
 */

public class Centered implements TextBlock{

  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  TextBlock text;

  int width;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  public Centered(TextBlock text, int width) {
    this.text = text;
    this.width = width;
  } // Centered(text, width)

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
    int pad = ((this.width - this.text.row(i).length()) / 2);
    //Determines padding on the left
    String padleft = TBUtils.spaces(pad);
    //Determine padding on the right
    String padright = TBUtils.spaces(pad);
    return padleft + this.text.row(i) + padright;
  } // row(int i)

  public int height() {
    return 1;
  } // height()

  public int width() {
    return this.width;
  } // width()
} // class Centered
