import java.io.PrintWriter;

/**
 * A series of experiments with the text block layout classes.
 * 
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class TBExpt {
  // +------+--------------------------------------------------------------
  // | Main |
  // +------+
  public static void main(String[] args) throws Exception {
    // Prepare for input and output
    PrintWriter pen = new PrintWriter(System.out, true);

    // Create a block to use
    

    // Print out the block

    TextLine t1 = new TextLine("Hello");
    TBUtils.print(pen, t1);
    TextLine t2 = new TextLine("Goodbye");
    VComposition t3 = new VComposition(t1,t2);
    BoxedBlock box1 = new BoxedBlock(t3);
    TBUtils.print(pen, box1);

    Truncated block12 = new Truncated(t1, 4);
    BoxedBlock block13 = new BoxedBlock(block12);
    TBUtils.print(pen, block13);

    Centered block14 = new Centered(t1, 9);
    BoxedBlock block15 = new BoxedBlock(block14);
    TBUtils.print(pen, block15);

    RightJustified block16 = new RightJustified(t1, 10);
    BoxedBlock block17 = new BoxedBlock(block16);
    TBUtils.print(pen, block17);

    HorizontallyFlipped block18 = new HorizontallyFlipped(t1, 5);
    BoxedBlock block19 = new BoxedBlock(block18);
    TBUtils.print(pen, block19);
    // Clean up after ourselves.

    VerticallyFlipped block20 = new VerticallyFlipped(t1, t2);
    BoxedBlock block21 = new BoxedBlock(block20);
    TBUtils.print(pen, block21);

    //MutableLine block22 = t2.eq(t1);

    LeftJustified block23 = new LeftJustified(t1, 10);
    BoxedBlock block24 = new BoxedBlock(block23);
    TBUtils.print(pen, block24);
    pen.close();
  } // main(String[])

} // class TBExpt
