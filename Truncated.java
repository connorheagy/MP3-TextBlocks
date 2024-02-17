
public class Truncated implements TextBlock{

  TextBlock text;

  int maxWidth;

  public Truncated(TextBlock text, int maxWidth) {
    this.text = text;
    this.maxWidth = maxWidth;
  }

  public String row(int i) throws Exception{
    return this.text.row(i).substring(0, this.maxWidth);
  }

  public int height() {
    return 1;
  }

  public int width() {
    return this.maxWidth;
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
