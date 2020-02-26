import org.junit.*;

import static edu.gvsu.mipsunit.munit.MUnit.Register.*;
import static edu.gvsu.mipsunit.munit.MUnit.*;

public class BranchTest {


    /******************************************************************
     *
     * Test makes10
     *
     *****************************************************************/

    @Test 
    public void makes10_aIs10() {
	run("makes10", 10, 3);
	Assert.assertEquals(1, get(v0));
    }

    @Test
    public void testA() {
        run("makes10", 9, 10);
        Assert.assertEquals(1, get(v0));
    }

    @Test
    public void testB() {
        run("makes10", 9, 9);
        Assert.assertEquals(0, get(v0));
    }

    @Test
    public void testC() {
        run("makes10", 1, 9);
        Assert.assertEquals(1, get(v0));
    }

    @Test
    public void testD() {
        run("makes10", 1, 10);
        Assert.assertEquals(1, get(v0));
    }

    @Test
    public void testE() {
        run("makes10", 10, 10);
        Assert.assertEquals(1, get(v0));
    }

    @Test
    public void testF() {
        run("makes10", 2, 8);
        Assert.assertEquals(1, get(v0));
    }

    @Test
    public void testG() {
        run("makes10", 8, 3);
        Assert.assertEquals(0, get(v0));
    }

    @Test
    public void testH() {
        run("makes10", 10, 42);
        Assert.assertEquals(1, get(v0));
    }

    @Test
    public void testI() {
        run("makes10", 12, -2);
        Assert.assertEquals(1, get(v0));
    }

    /******************************************************************
     *
     * Test intMax
     *
     *****************************************************************/

    @Test 
    public void testJ() {
	run("intMax", 5, 6, 7);
	Assert.assertEquals(7, get(v0));
    }

    @Test
    public void testK() {
        run("intMax", 1, 2, 3);
        Assert.assertEquals(3, get(v0));
    }

    @Test
    public void testL() {
        run("intMax", 1, 3, 2);
        Assert.assertEquals(3, get(v0));
    }

    @Test
    public void testM() {
        run("intMax", 3, 2, 1);
        Assert.assertEquals(3, get(v0));
    }

    @Test
    public void testN() {
        run("intMax", 9, 3, 3);
        Assert.assertEquals(9, get(v0));
    }

    @Test
    public void testO() {
        run("intMax", 3, 9, 3);
        Assert.assertEquals(9, get(v0));
    }

    @Test
    public void testP() {
        run("intMax", 3, 3, 9);
        Assert.assertEquals(9, get(v0));
    }

    @Test
    public void testQ() {
        run("intMax", 8, 2, 3);
        Assert.assertEquals(8, get(v0));
    }

    @Test
    public void testR() {
        run("intMax", -3, -1, -2);
        Assert.assertEquals(-1, get(v0));
    }


    /******************************************************************
     *
     * Test close10
     *
     *****************************************************************/

    @Test 
    public void testS() {
	run("close10", 8, 13);
	Assert.assertEquals(8, get(v0));
    }

    @Test
    public void testT() {
        run("close10", 13, 8);
        Assert.assertEquals(8, get(v0));
    }

    @Test
    public void testU() {
        run("close10", 13, 7);
        Assert.assertEquals(0, get(v0));
    }

    @Test
    public void testV() {
        run("close10", 7, 13);
        Assert.assertEquals(0, get(v0));
    }

    @Test
    public void testW() {
        run("close10", 9, 13);
        Assert.assertEquals(9, get(v0));
    }

    @Test
    public void testX() {
        run("close10", 8, 13);
        Assert.assertEquals(8, get(v0));
    }

    @Test
    public void testY() {
        run("close10", 10, 12);
        Assert.assertEquals(10, get(v0));
    }

    @Test
    public void testZ() {
        run("close10", 11, 10);
        Assert.assertEquals(10, get(v0));
    }

    @Test
    public void test1() {
        run("close10", 5, 21);
        Assert.assertEquals(5, get(v0));
    }




    /******************************************************************
     *
     * Test dateFashion
     *
     *****************************************************************/

    @Test 
    public void test2() {
	run("dateFashion", 5, 10);
	Assert.assertEquals(2, get(v0));
    }

    @Test
    public void test3() {
        run("dateFashion", 5, 2);
        Assert.assertEquals(0, get(v0));
    }

    @Test
    public void test4() {
        run("dateFashion", 5, 5);
        Assert.assertEquals(1, get(v0));
    }
    @Test
    public void test5() {
        run("dateFashion", 3, 3);
        Assert.assertEquals(1, get(v0));
    }
    @Test
    public void test6() {
        run("dateFashion", 10, 2);
        Assert.assertEquals(0, get(v0));
    }
    @Test
    public void test7() {
        run("dateFashion", 2, 9);
        Assert.assertEquals(0, get(v0));
    }
    @Test
    public void test8() {
        run("dateFashion", 9, 9);
        Assert.assertEquals(2, get(v0));
    }
    @Test
    public void test9() {
        run("dateFashion", 5, 10);
        Assert.assertEquals(2, get(v0));
    }
    @Test
    public void test0() {
        run("dateFashion", 2, 2);
        Assert.assertEquals(0, get(v0));
    }
    @Test
    public void testLast() {
        run("dateFashion", 3, 7);
        Assert.assertEquals(1, get(v0));
    }

    // Write more tests!


} // end class

