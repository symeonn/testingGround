package api.generics;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by mariusz.lewandowski on 2016-03-25.
 */
public class GenericsTest {




    @Before
    public void setUp(){

    }


    @Test
    public void genericClassTest(){

        GenericClass rawGenericClass = new GenericClass();

        rawGenericClass.setTypeParam(new Integer(4));
        assertTrue(rawGenericClass.getTypeParam() instanceof Integer);

        rawGenericClass.setTypeParam("kuku na minuy");
        assertTrue(rawGenericClass.getTypeParam() instanceof String);



        GenericClass<Number> genericClass = new GenericClass<>();

        genericClass.setTypeParam(new Double(5.4));
        assertTrue(genericClass.getTypeParam() instanceof Double);
        genericClass.setTypeParam(5.6);
        assertTrue(genericClass.getTypeParam() instanceof Double);
        genericClass.setTypeParam(5d);
        assertTrue(genericClass.getTypeParam() instanceof Double);


    }

    @Test
    public void inheritanceTest(){

        GenericClass<Number> genericClass = new GenericClass<>();

        genericClass.setTypeParam(new Double(5.4));
        assertTrue(genericClass.getTypeParam() instanceof Double);
        genericClass.setTypeParam(new Integer(9));
        assertTrue(genericClass.getTypeParam() instanceof Integer);

        byte b = 0b11001;
        genericClass.setTypeParam(new Byte(b));
        assertTrue(genericClass.getTypeParam() instanceof Byte);

    }

    @Test
    public void genericMethodTest() {

        GenericClass<Number> doubleGenericClass = new GenericClass<>();
        GenericClass<Float> floatGenericClass = new GenericClass<>();
        floatGenericClass.setTypeParam(new Float(7.8));

        doubleGenericClass.setTypeParam(new Double(5.4));

        assertTrue(doubleGenericClass.receiveType(floatGenericClass) instanceof Float);

    }

    @Test
    public void wildcardsTest() {

        GenericClass genericClass = new GenericClass();

        List<Integer> li = Arrays.asList(1, 2, 3);
        genericClass.printList(li);

        List<String> ls = Arrays.asList("one", "two", "three");
        genericClass.printList(ls);



    }



    public class GenericClass<T> {

        T typeParam;

        public T getTypeParam() {
            return typeParam;
        }

        public void setTypeParam(T typeParam) {
            this.typeParam = typeParam;
        }


        public <T> T receiveType(GenericClass<T> t){

            return t.getTypeParam();
        }

        public void printList(List<Object> list) {
            for (Object elem : list)
                System.out.println(elem + " ");
            System.out.println();
        }


    }

}
