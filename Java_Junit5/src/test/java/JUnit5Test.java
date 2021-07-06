import org.junit.jupiter.api.*;

/**
 * @Author secoder
 * @File JUnitTest
 * @Time 2021-07-05 23:38
 * @Description
 */
@DisplayName("这是我的JUnit测试类")
public class JUnit5Test {

    @BeforeAll
    public static void init(){
        System.out.println("初始化数据");
    }

    @AfterAll
    public static void cleanup(){
        System.out.println("清理数据");
    }

    @BeforeEach
    public void tearup(){
        System.out.println("当前测试方法开始");
    }

    @AfterEach
    public void teardown(){
        System.out.println("当前测试方法结束");
    }

    @DisplayName("这是我的第1个测试方法")
    @Test
    void TestFirstCase(){
        System.out.println("这是我的第1个测试方法");
    }

    @DisplayName("这是我的第2个测试方法")
    @Test
    void TestSecondCase(){
        System.out.println("这是我的第2个测试方法");
    }
}
