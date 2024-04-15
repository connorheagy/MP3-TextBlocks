import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testing class for all textblocks and edgecases
 * 
 * @author Vincent Yao
 * @author Connor Heagy
 */

public class TextBlockTests {

// testing to see RightJustified formats the TextLine correctly
@Test
public void RightJustified() throws Exception {
    TextLine t1 = new TextLine("Hello");
    RightJustified test2 = new RightJustified(t1, 10);
    assertEquals("Right-justified content should match expected padding", "     Hello", test2.row(0));   
} // RightJustified

// testing to see Truncated formats the TextLine correctly
@Test
public void testTruncated() throws Exception{
    TextLine t1 = new TextLine("Hello");
    Truncated test3 = new Truncated(t1, 4);
    assertEquals("Truncated content should match the substringed based upon maxWidth", "Hell", test3.row(0));   
} // testTruncated

// testing to see Centered formats the TextLine correctly
@Test
public void testCentered() throws Exception{
    TextLine t1 = new TextLine("Hello");
    Centered test4 = new Centered(t1, 9);
    assertEquals("Centered content should be center based upon the given width", "  Hello  ", test4.row(0));
} // testCentered()

// testing to see HorizontallyFlipped formats the TextLine correctly
@Test
public void testHorizontallyFlipped() throws Exception{
    TextBlock t1 = new TextLine("Hello");
    HorizontallyFlipped test5 = new HorizontallyFlipped(t1, 5);
    assertEquals("Content should be reversed from original text", "olleH", test5.row(0));
} // testHorizontallyFlipped()

// testing to see VerticallyFlipped formats the TextLine correctly
@Test
public void testVerticallyFlipped() throws Exception{
    TextLine t1 = new TextLine("Hello");
    TextLine t2 = new TextLine("Goodbye");
    VerticallyFlipped test6 = new VerticallyFlipped(t1, t2);
    assertEquals("Content should vertically flipped", "Goodbye", test6.row(0));
} // testVerticallyFlipped()

// testing to see LeftJustified formats the TextLine correctly
@Test
public void testLeftJustified() throws Exception{
    TextLine t1 = new TextLine("Hello"); 
    LeftJustified test7 = new LeftJustified(t1, 10);
    assertEquals("Content should be left justified", "Hello     ", test7.row(0));
} // testLeftJustified()

// testing to see RightJustified formats the TextLine correctly when it is empty
@Test
public void testEmptyRightJustifed() throws Exception {
    TextLine t1 = new TextLine("");
    RightJustified test8 = new RightJustified(t1, 10);
    assertEquals("Right-justified content should match expected padding","          ", test8.row(0));   
} // testEmptyRightJustified()

// testing to see LeftJustified formats the TextLine correctly when it is empty
@Test
public void testEmptyLeftJustifed() throws Exception {
    TextLine t1 = new TextLine("");
    LeftJustified test9 = new LeftJustified(t1, 10);
    assertEquals("Left-justified content should match expected padding","          ", test9.row(0));   
} // testEmptyLeftJustified()

// testing to see VericallyFlipped formats correctly when it is empty
@Test
public void testEmptyVerticallyFlipped() throws Exception {
    TextLine t1 = new TextLine("");
    TextLine t2 = new TextLine("");
    VerticallyFlipped test10 = new VerticallyFlipped(t1, t2);
    assertEquals("content should be flipped vertically","", test10.row(0));   
} // testEmptyVerticallyFlipped()

// testing to see Truncated formats correctly when the input is long
@Test
public void testTruncatedLongInput() throws Exception {
    TextLine t1 = new TextLine("Hello World");
    Truncated test = new Truncated(t1, 5);
    assertEquals("Should truncate to max width", "Hello", test.row(0));
} // testTruncatedLongInput()

// testing to see RightJustified formats the TextLine correctly when there is white space
@Test
public void testRightJustifiedWithWhiteSpace() throws Exception {
    TextLine t1 = new TextLine("  Hello  ");
    RightJustified test = new RightJustified(t1, 12);
    assertEquals("Should handle white spaces", "     Hello  ", test.row(0));
} // testRightJustifiedWithWhiteSpace()

// testing to see Centered formats the TextLine correctly when there is white space
@Test
public void testCenteredWithWhiteSpace() throws Exception {
    TextLine t1 = new TextLine("  Hello  ");
    Centered test = new Centered(t1, 12);
    assertEquals("Should handle white spaces", "   Hello   ", test.row(0));
} // testCenteredWithWhiteSpace()

// testing to see RightJustified formats the TextLine correctly when it is null
@Test
(expected = NullPointerException.class)
public void testRightJustifiedNull() throws Exception {
    TextLine t1 = new TextLine(null);
    RightJustified test = new RightJustified(t1, 10);
    test.row(0);
} // testRightJustifiedNull()

// testing to see if equal works correctly
@Test
public void testequal() throws Exception{
// Test structural equivalence
    TextLine t1 = new TextLine("Hello");  
    RightJustified t2 = new RightJustified(t1, 10);
    assertFalse("not equal", TBUtils.eqv(t1, t2));
} // testequal()

// testing to see if Eqv is working correctly
@Test
public void testEqv() throws Exception{
    TextLine t1 = new TextLine("Hello");
    RightJustified t2 = new RightJustified(t1, 9);
    assertFalse("not equal", TBUtils.equal(t1, t2));
} // testEqv()

// testing to see if Eq is working correctly
@Test
public void testEq() throws Exception{
    TextLine t1 = new TextLine("Hello");
    RightJustified t2 = new RightJustified(t1, 9);
    assertFalse("not equal", TBUtils.equal(t1, t2));
} // testEq()
} // class TextBlockTests

