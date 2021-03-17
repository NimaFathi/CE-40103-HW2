import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSquare {
    Square square = new Square(10);
    @Test
    public void testSquareArea(){
        assertEquals(100, square.computeArea(), 0);
    }
    @Test
    public void testGetSquareEdge() {
        assertEquals(10, square.getEdge(), 0);
    }
}
