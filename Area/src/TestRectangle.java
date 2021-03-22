import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRectangle {
    Rectangle rectangle = new Rectangle(10,22);

    @Test
    public void testGetRectangleWidth() {
        assertEquals(10, rectangle.getWidth(), 0);
    }

    @Test
    public void testGetRectangleHeight() {
        assertEquals(22, rectangle.getHeight(), 0);
    }

    @Test
    public void testRectangleComputeArea() {
        assertEquals(220, rectangle.computeArea(), 0);
    }

    @Test
    public void testSetRectangleWidth() {
        rectangle.setWidth(32);
        assertEquals(32, rectangle.getWidth(),0);
    }

    @Test
    public void testSetRectangleHeight() {
        rectangle.setHeight(15);
        assertEquals(15, rectangle.getHeight(),0);
    }
    @Test
    public void testRectangleAreaAfterChangingSize() {
        System.out.print("before changing size");
        assertEquals(220, rectangle.computeArea(), 0);
        rectangle.setHeight(20);
        System.out.print("after changing size");
        assertEquals(200, rectangle.computeArea(), 0);
    }
}