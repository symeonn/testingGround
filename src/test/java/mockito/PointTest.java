package mockito;

import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

/**
 * Created by mariusz.lewandowski on 2015-04-16.
 */
public class PointTest {



    @Test
    public void testName() throws Exception {


        // do not mock tested object
        Point p = mock(Point.class);

        when(p.getX()).thenReturn(1.0);

        System.out.println(p.getX());

        verify(p, times(1)).getX();

        assertEquals(21.0, p.getX(), 20);
    }
}