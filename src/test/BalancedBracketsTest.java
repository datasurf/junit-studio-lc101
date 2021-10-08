package test;
import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
    //@Before
    //String testObject = "[LaunchCode";


    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testBracketsNotNull() {
        assertNotNull("[LaunchCode");
    }


    @Test
    public void singleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void emptyStringIsNotABalancedBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void closingBracketBeforeOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }


    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

}
