package api.exceptions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by mariusz.lewandowski on 2016-03-25.
 */
public class ExceptionsTest {


    @Before
    public void setUp() {

    }


    @Test
    public void chainExceptionsTest() {

        TestedClass tc = new TestedClass();

        try {
            tc.throwParentException();
        } catch (Exception e) {
            assertTrue(e instanceof ParentException);
            assertTrue(e.getCause() instanceof ChildException);
        }

    }


    public class TestedClass {

        public void throwParentException() throws ParentException {

            try {
                throwChildException();
            } catch (ChildException ce) {
                throw new ParentException("second throw", ce);
            }
        }

        private void throwChildException() throws ChildException {
            throw new ChildException("first throw");
        }
    }

}

class ParentException extends Exception {

    public ParentException(String cause, Throwable e) {
        super(cause, e);
    }
}

class ChildException extends Exception {

    public ChildException(String cause) {
        super(cause);
    }
}
