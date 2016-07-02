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

}
