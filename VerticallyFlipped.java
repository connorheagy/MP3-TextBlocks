/**
 * Impliments the TextBlock interface and creates a vertically flipped text block.
 * 
 * @author Connor Heagy
 * @author Vincent Yao
 */
public class VerticallyFlipped implements TextBlock{

  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  TextBlock top;

  TextBlock bottom;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  /** 
   * 
   * Builds a Textblock where the text is vertically flipped
   * */ 
  public VerticallyFlipped(TextBlock top, TextBlock bottom) {
    this.top = top;
    this.bottom = bottom;
  } // VerticallyFlipped(top, bottom)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Get one row from the block.
   * 
   * @pre 0 <= i < this.height()
   * @exception Exception if the precondition is not met
   */
  public String row(int i) throws Exception {
    // Gather some basic information
    int th = this.top.height();
    int bh = this.bottom.height();
    int tw = this.top.width();
    int bw = this.bottom.width();
    int h = th + bh;

    String padtop = "";
    String padbot = "";
    if (tw > bw) {
      padbot = TBUtils.spaces(tw - bw);
    } else {
      padtop = TBUtils.spaces(bw - tw);
    } 

    if ((i < 0) || (i >= h)) {
      throw new Exception("Invalid row " + i);
    } else if (i < th) {
      return this.bottom.row(i) + padbot;
    } else {
      return this.top.row(i - th) + padtop;
    } 
  } // row(int i)

  /**
   * Determine how many rows are in the block.
   */
  public int height() {
    // The height is the sum of the heights of the top and bottom
    // blocks.
    return this.top.height() + this.bottom.height();
  } // height()

  /**
   * Determine how many columns are in the block.
   */
  public int width() {
    // The width is the greater of the widths of the top and bottom
    // blocks.
    return Math.max(this.top.width(), this.bottom.width());
  } // width()
} // class VComposition


 