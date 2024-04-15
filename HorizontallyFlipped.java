/**
 * Implements the TextBlock interface and creates a horizontally flipped text block  
 * 
 * @author Connor Heagy
 * @author Vincent Yao
 */
public class HorizontallyFlipped implements TextBlock{

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
   * building a new constructor fipping the order of the textblock horizontally
   */
  public HorizontallyFlipped(TextBlock text, int width) {
    this.text = text;
    this.width = width;
  } // HorizontallyFlipped(t1, t2)

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
    char letter;
    String result = "";
    for (int j = 0; j < this.text.row(i).length(); j++) {  
      letter = this.text.row(i).charAt(j);
      result = letter + result;
    } // for
    return result;
  } // row(int i)

  /**
   * Determine how many rows are in the block.
   */
  public int height() {
    return 1;
  } //height()

  /**
   * Determine how many columns are in the block.
   */
  public int width() {
    return this.width;
  } //width()
} // class HorizontallyFlipped 