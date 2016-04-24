package api.collections;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertTrue;

/**
 * Created by mariusz.lewandowski on 2016-03-25.
 */
public class SetTest {


    public Set<Person> set;


    @Before
    public void setUp(){

    }


    @Test
    public void treeSetTest(){

        set = new TreeSet<>();

        Person p1 = new Person("f1", "l1");
        Person p2 = new Person("f1", "l2");

        set.add(p1);
        set.add(p2);

        assertTrue(set.size() == 1);
    }

    @Test
    public void hashSetTest() {

        set = new HashSet<>();

        Person p1 = new Person("f1", "l1");
        Person p2 = new Person("f1", "l1");

        set.add(p1);
        set.add(p2);

        assertTrue(set.size() == 2);

        set.clear();
        set.add(p1);
        set.add(p1);

        assertTrue(set.size() == 1);
    }

//    @Test
    public void linkedHashSetTest() {

        set = new LinkedHashSet<>();


    }

    public class Person implements Comparable<Person>{
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
