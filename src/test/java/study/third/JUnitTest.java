package study.third;

import org.junit.jupiter.api.*;

public class JUnitTest {


    @BeforeAll
    static void beforeAll(){
        System.out.println("@BeforeAll");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("@BeforeEach");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }
    @Test
    public void test3(){
        System.out.println("test3");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("@AfterAll");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("@AfterEach");
    }


    @DisplayName("1 + 2는 3이다")
    @Test
    public void junitTest(){
        int a = 1;
        int b = 2;
        int sum = 3;
        Assertions.assertEquals(a+b,sum);
    }

//    @DisplayName("1 + 3은 4이다")
//    @Test
//    public void junitFailedTest(){
//        int a = 1;
//        int b = 3;
//        int sum = 3;
//        Assertions.assertEquals(a+b,sum);
//    }
//



}
