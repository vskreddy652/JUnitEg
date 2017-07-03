package frst;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {
    private int value1;
    private int value2;
    public AppTest(String testName) {
        super(testName);
    }
    protected void setUp() throws Exception {
        super.setUp();
        value1 = 3;
        value2 = 5;

        System.out.println("SettingUp...");
    }
    protected void tearDown() throws Exception {
        super.tearDown();
        value1 = 0;
        value2 = 0;
    }
    public void testAdd() {
        int total = 8;
        int sum = App.add(value1, value2);
        assertEquals(sum, total);
    }
    public void testFailedAdd() {
        int total = 9;
        int sum = App.add(value1, value2);
        assertNotSame(sum, total);
    }
    public void testSub() {
        int total = -2;
        int sub = App.sub(value1, value2);
        assertEquals(sub, total);
    }

    public void testMul() {
        int total = 15;
        int sub = App.mul(value1, value2);
        assertEquals(sub, total);
    }
}