package mathschool;

import org.junit.Test;
import org.mathschool.foobar.FooBar;
import static org.assertj.core.api.Assertions.*;

public class FooBarTests {
    @Test
    public void runFooBarTests() {
        // Test Case 1
        testFooBar("1,2,3,4,5,6,45", "1,2,foo,4,bar,foo,foobar");
        // Test Case 2
        testFooBar("1,2,3,1,2,3,1,1", "1,2,foo,1-copy,2-copy,foo-copy,1-copy,1-copy");
        // Test Case 3
        testFooBar("1,1,3,3,5,5,45,45", "1,1-copy,foo,foo-copy,bar,bar-copy,foobar,foobar-copy");
    }
    private void testFooBar(String paramInput, String expectedOutput) {
        String actualOutput = FooBar.fooBar(paramInput);
        assertThat(expectedOutput).isEqualTo(actualOutput);
    }
}
