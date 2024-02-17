//Authors: Vincent and Connor 
//Date: Feb. 16th 2024

public class VerticallyFlipped implements TextBlock{

  TextBlock top;

  TextBlock bottom;

  public VerticallyFlipped(TextBlock top, TextBlock bottom) {
    this.top = top;
    this.bottom = bottom;
  }
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
  } 
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

  public boolean equal(TextBlock other) {
    if (this.height() != other.height() || this.width() != other.width()) {
      return false;
  }
  for (int i = 0; i < this.height(); i++) {
      try {
          if (!this.row(i).equals(other.row(i))) {
              return false;
          }
      } catch (Exception e) {
          return false;
      }
  }
  return true;
  }

  public boolean eqv(TextBlock other) {
    if (this instanceof TextBlock && other instanceof TextBlock) {
        return this.equal(other);
    }
    return false;
  }

  public boolean eq(TextBlock other){
    return this==other;
  }

} // class VComposition


 