
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GeometryTest.
 *
 * @author  (Bill Gly)
 * @version (9-9-17)
 */
public class GeometryTest
{
    /**
     * Default constructor for test class GeometryTest
     */
    public GeometryTest() { }

    @Test
    public void testCircleArea() {
        assertEquals(3.14, Geometry.getCircleArea(1.0), 0.1);
    }

    @Test
    public void testRectabgleArea() {
        assertEquals(11.0, Geometry.getRectangleArea(5.5, 2.0), 0.1);
    }

    @Test
    public void testTriangleArea() {
        assertEquals(5.0, Geometry.getTriangleArea(4.0, 2.5), 0.1);
    }
}