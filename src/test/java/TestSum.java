import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSum {
    StringCalculator stringCalculator = new StringCalculator();

    @Test
    void checkEmptyString(String str){
        assertEquals(0,stringCalculator.calculate(str));
    }

    public static void main(String[] args){
        String str = "";
        TestSum testSum = new TestSum();
        testSum.checkEmptyString(str);
    }
}
