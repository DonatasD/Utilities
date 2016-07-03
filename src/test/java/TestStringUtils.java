import com.donatasd.utils.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class to check {@link com.donatasd.utils.StringUtils}
 *
 * @author Donatas Daubaras
 */
public class TestStringUtils {

    @Test
    public void testIsStringPermutation() {
        // Check different length
        Assert.assertFalse("Different length", StringUtils.isStringPermutation("abc", "abcd"));
        // Check not a permutation
        Assert.assertFalse("Is not a permutation", StringUtils.isStringPermutation("abcde", "bagcf"));
        // Check not a permutation with same letters just repeating different times
        Assert.assertFalse("Is not a permutation. Different number of repetitions", StringUtils.isStringPermutation("aaabbc", "cccbba"));
        // Check permutation
        Assert.assertTrue("Is a permutation", StringUtils.isStringPermutation("abcde", "debac"));
        // Check permutation with multiple same characters
        Assert.assertTrue("Is a permutation with more than one same character", StringUtils.isStringPermutation("aabbcc", "abccba"));
    }
    @Test
    public void testSwapCharacters() {
        // Check if swap is performed correctly with odd number of characters
        Assert.assertEquals("Odd number of characters", StringUtils.swapCharacters("abcde"), "edcba");
        // Check if swap is performed correctly with even number of characters
        Assert.assertEquals("Even number of characters", StringUtils.swapCharacters("abcd"), "dcba");
    }

    @Test
    public void testRotateString() {
        // Check if rotation works counterclockwise (negative number of positions to rotate)
        Assert.assertEquals("Negative number of positions to rotate", StringUtils.rotateString("abcde", -1), "bcdea");
        // Check if rotation works clockwise (positive number of positions to rotate)
        Assert.assertEquals("Positive number of positions to rotate", StringUtils.rotateString("abcde", 1), "eabcd");
        // Check if rotation works when number of positions to rotate is 0
        Assert.assertEquals("0 number of positions to rotate", StringUtils.rotateString("abcde", 0), "abcde");
        // Check if rotation works when number of positions are equal to string length
        Assert.assertEquals("string length number of positions to rotate", StringUtils.rotateString("abcde", 5), "abcde");
    }

}
