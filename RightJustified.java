public class RightJustified implements TextBlock{

  TextBlock text;
  int width;

  public RightJustified(TextBlock text, int width) {
    this.text = text;
    this.width = width;
  }

  public String row(int i) throws Exception{
    int pad = this.width - this.text.row(i).length();
    String padleft = TBUtils.spaces(pad);
    
    return padleft + this.text.row(i);
  }

  public int height() {
    return 1;
  }

  public int width() {
    return this.width;
  } 

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
}