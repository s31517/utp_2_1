import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class MainTest {
    ElOps elops = new ElOps();
    @Test
    public void TestAddition(){
        assertEquals(9, elops.add(4, 5));
    }

    @ParameterizedTest
    @ValueSource(ints = {3,45,0,444})
    public void testAddition2(int expr){
        assertEquals(6, elops.add(3, expr));
    }

    @ParameterizedTest
    @ValueSource(ints = {-3,5, 0, 34})
    public void test3(int expr){
        assertEquals(true, elops.isPositive(expr));
    }

    @Test
    public void TestPosNeg(){
        assertAll(
                () -> assertTrue(elops.isNegative(-4)),
                () -> assertTrue(elops.isPositive(5)),
                () -> assertTrue(elops.isNegative(-0)),
                () -> assertTrue(elops.isPositive(0)),
                () -> assertTrue(elops.isNegative(4)),
                () -> assertTrue(elops.isPositive(-5))
        );

    }
}
