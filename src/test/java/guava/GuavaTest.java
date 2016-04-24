package guava;

import com.google.common.base.Strings;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by mariusz.lewandowski on 2015-04-21.
 */
public class GuavaTest {

//    @Test
    public void testNullToEmptyString() throws Exception {

        String nullString = null;
        String notEmptyString = "123";

        String emptyString = Strings.nullToEmpty(nullString);
        String notEmptyString2 = Strings.nullToEmpty(notEmptyString);

        assertNotNull(emptyString);
        assertEquals("", emptyString);

        assertNotNull(notEmptyString2);
        assertEquals("123", notEmptyString2);

    }

    @Test
    public void testNullToEmptyObject() throws Exception {

        Object nullObject = null;
        Object notEmptyObject = "123";
        Object notEmptyLongObject = 2L;

        String emptyString = Strings.nullToEmpty((String)nullObject);
        String notEmptyString2 = Strings.nullToEmpty((String)notEmptyObject);
//        String notEmptyLongString = Strings.nullToEmpty(notEmptyLongObject);

        assertNotNull(emptyString);
        assertEquals("", emptyString);

        assertNotNull(notEmptyString2);
        assertEquals("123", notEmptyString2);
    }
}
