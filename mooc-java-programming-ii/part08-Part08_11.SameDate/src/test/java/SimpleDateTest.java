
import fi.helsinki.cs.tmc.edutestutils.Points;
import fi.helsinki.cs.tmc.edutestutils.Reflex;
import org.junit.*;
import static org.junit.Assert.*;

@Points("08-11")
public class SimpleDateTest {

    Reflex.ClassRef<Object> klass;
    String klassName = "SimpleDate";

    @Before
    public void findClass() {
        klass = Reflex.reflect(klassName);
    }

    @Test
    public void hasMethodEquals() throws Throwable {
        String method = "equals";

        SimpleDate object = new SimpleDate(1, 1, 2011);

        assertTrue("write a method public boolean " + method + "(Object other) for the class " + klassName,
                klass.method(object, method).returning(boolean.class).taking(Object.class).isPublic());

    }

    @Test
    public void equalsFalseIfYearDifferent() {
        SimpleDate first = new SimpleDate(3, 7, 2011);
        SimpleDate second = new SimpleDate(3, 7, 2010);

        assertFalse("When we call:\nboolean isIt = new SimpleDate(3, 7, 2011).equals(new SimpleDate(3, 7, 2010));\n the value of the variable isIt should be false.", first.equals(second));
    }

    @Test
    public void equalsFalseIfMonthDifferent() {
        SimpleDate first = new SimpleDate(3, 7, 2011);
        SimpleDate second = new SimpleDate(3, 6, 2011);

        assertFalse("When we call:\nboolean isIt = new SimpleDate(3, 7, 2011).equals(new SimpleDate(3, 6, 2011));\n the value of the variable isIt should be false.", first.equals(second));
    }

    @Test
    public void equalsFalseIfDayDifferent() {
        SimpleDate first = new SimpleDate(3, 7, 2011);
        SimpleDate second = new SimpleDate(4, 7, 2011);

        assertFalse("When we call:\nboolean isIt = new SimpleDate(3, 7, 2011).equals(new SimpleDate(4, 7, 2011));\n the value of the variable isIt should be false.", first.equals(second));
    }

    @Test
    public void equalsTrueIfDateIsSame() {
        SimpleDate first = new SimpleDate(3, 7, 2011);
        SimpleDate second = new SimpleDate(3, 7, 2011);

        assertTrue("When we call:\nboolean isIt = new SimpleDate(3, 7, 2011).equals(new SimpleDate(3, 7, 2011));\n the value of the variable isIt should be true.", first.equals(second));
    }

    /**
     * Test of toString method, of class SimpleDate.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SimpleDate instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of earlier method, of class SimpleDate.
     */
    @Test
    public void testEarlier() {
        System.out.println("earlier");
        SimpleDate other = null;
        SimpleDate instance = null;
        boolean expResult = false;
        boolean result = instance.earlier(other);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of differenceInYears method, of class SimpleDate.
     */
    @Test
    public void testDifferenceInYears() {
        System.out.println("differenceInYears");
        SimpleDate other = null;
        SimpleDate instance = null;
        int expResult = 0;
        int result = instance.differenceInYears(other);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class SimpleDate.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        SimpleDate instance = null;
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class SimpleDate.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        SimpleDate instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

}
