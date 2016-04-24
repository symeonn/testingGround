package api.collections;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertTrue;

/**
 * Created by mariusz.lewandowski on 2016-03-25.
 */
public class ListTest {


    public List<Person> list;


    @Before
    public void setUp() {

    }


    @Test
    public void arrayListTest() {

        list = new ArrayList<>();


        Person p1 = new Person("f1", "l1");
        Person p2 = new Person("f1", "l2");

        list.add(p1);
        list.add(p2);

        assertTrue(list.size() == 2);
    }

    @Test
    public void linkedListTest() {

        list = new LinkedList<>();

        Person p1 = new Person("f1", "l1");
        Person p2 = new Person("f1", "l1");

        list.add(p1);
        list.add(p2);

        assertTrue(list.size() == 2);

//        set.clear();
//        set.add(p1);
//        set.add(p1);
//
//        assertTrue(set.size() == 1);
    }


    public class Person implements Comparable<Person> {
        public String firstname;
        public String lastname;

        public Person(String firstname, String lastname) {
            this.firstname = firstname;
            this.lastname = lastname;
        }

        @Override
        public int compareTo(Person o) {
            return this.firstname.compareTo(o.firstname);
        }
    }

}
