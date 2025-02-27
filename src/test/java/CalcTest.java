import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.project_calc.SumCalculator;

public class CalcTest {
    private SumCalculator calc;
    @BeforeEach
    public void BeforeEach(){
        calc  = new SumCalculator();
    }

    @Test
    public void testThatSumCorrectWith1(){
        //WHEN
        int actual = calc.sum(1);

        //THEN
        int expected = 1;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testThatSumCorrectWith3(){
        //WHEN
        int actual = calc.sum(3);

        //THEN
        int expected = 6;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testThatSumCorrectWith0(){

        Assertions.assertThrows(IllegalArgumentException.class,() ->{
            calc.sum(0);
        });
    }

}
