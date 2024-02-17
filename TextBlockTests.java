import org.junit.Test;
import static org.junit.Assert.*;

public class TextBlockTests {
@Test
public void RightJustified() throws Exception {
    TextLine t1 = new TextLine("Hello");
    RightJustified test2 = new RightJustified(t1, 10);
    assertEquals("Right-justified content should match expected padding", "     Hello", test2.row(0));   
}

@Test
public void testTruncated() throws Exception{
    TextLine t1 = new TextLine("Hello");
    Truncated test3 = new Truncated(t1, 4);
    assertEquals("Truncated content should match the substringed based upon maxWidth", "Hell", test3.row(0));   
}

@Test
public void testCentered() throws Exception{
    TextLine t1 = new TextLine("Hello");
    Centered test4 = new Centered(t1, 9);
    assertEquals("Centered content should be center based upon the given width", "  Hello  ", test4.row(0));
}

@Test
public void testHorizontallyFlipped() throws Exception{
    TextLine t1 = new TextLine("Hello");
    HorizontallyFlipped test5 = new HorizontallyFlipped(t1, 5);
    assertEquals("Content should be reversed from original text", "olleH", test5.row(0));
}

@Test
public void testVerticallyFlipped() throws Exception{
    TextLine t1 = new TextLine("Hello");
    TextLine t2 = new TextLine("Goodbye");
    VerticallyFlipped test6 = new VerticallyFlipped(t1, t2);
    assertEquals("Content should vertically flipped", "Goodbye", test6.row(0));
}

@Test
public void testLeftJustified() throws Exception{
    TextLine t1 = new TextLine("Hello"); 
    LeftJustified test7 = new LeftJustified(t1, 10);
    assertEquals("Content should be left justified", "Hello     ", test7.row(0));
}

@Test
public void testequal() throws Exception{
// Test structural equivalence
    TextBlock t1 = new TextLine("Hello");  
    RightJustified t2 = new RightJustified(t1, 10);
    assertFalse("not equal", t1.eqv(t2));
}

@Test
public void testEqv() throws Exception{
    TextBlock t1 = new TextLine("Hello");
    RightJustified t2 = new RightJustified(t1, 9);
    assertFalse("not equal", t2.equal(t1));
}

@Test
public void eq() throws Exception{
    TextBlock t1 = new TextLine("Hello");
    RightJustified t2 = new RightJustified(t1, 9);
    assertFalse("not equal", t2.equal(t1));
}
}
