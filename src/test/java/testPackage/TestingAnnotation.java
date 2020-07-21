package testPackage;

import org.junit.*;

public class TestingAnnotation {
    static int beforeClass =1;
    static int afterClass =1;
    static int before = 1;
    static int after = 1;

    @BeforeClass
    public static void testBeforeClass(){
        System.out.println ("Test beforeClass Annotation " +beforeClass++);
    }
    @Before
    public void testBefore(){
        System.out.println ("Test before annotation "+ before++);
    }
    @Test
    public void test1(){
        System.out.println ("The testing method will execute here ...");
    }
    @Test
    public void test2(){
        System.out.println ("The testing method will execute here ...");
    }
    @Test
    public void test3(){
        System.out.println ("The testing method will execute here ...");
    }
    @Test
    public void test4(){
        System.out.println ("The testing method will execute here ...");
    }
    @Test
    public void test5(){
        System.out.println ("The testing method will execute here ...");
    }
    @After
    public void testAfter(){
        System.out.println ("Test after annotation "+after++);
    }
    @AfterClass
    static public void testAfterClass(){
        System.out.println ("Test afterClass annotation "+afterClass++);
    }
}
