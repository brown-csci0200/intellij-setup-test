package sol;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.Email;
import src.Item;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Homework1ATest {
    private EmailUtilities testUtilities;
    private Email e1, e2, e3, e4, e5, e6, e7;

    @Before
    public void initializeTestList() {
        e1 = new Email("milda@brown.edu", "cs200 is cool", false);
        e2 = new Email("milda@brown.edu", "programming", false);
        e3 = new Email("milda@green.edu", "do your homework", false);
        e4 = new Email("milda@brown.edu", "please read this", true);
        e5 = new Email("seth@brown.edu", "hello", true);
        e6 = new Email("nathan@brown.edu", "Autograder for cs200", false);
        e7 = new Email("cindy@brown.edu", "meandering walks", true);

        List<Email> testEmailList = new LinkedList<Email>();
        testEmailList.add(e1);
        testEmailList.add(e2);
        testEmailList.add(e3);
        testEmailList.add(e4);
        testEmailList.add(e5);
        testEmailList.add(e6);
        testEmailList.add(e7);

        this.testUtilities = new EmailUtilities(testEmailList);
    }

    @Test
    public void testGetAllUnread() {
        // TASK 1-A Email Utility unit test
        List<Email> expectedResult = new LinkedList<Email>();
        expectedResult.add(e1);
        // TODO: add Emails to expectedResult as necessary
        Assert.assertEquals(this.testUtilities.getAllUnread(), expectedResult);
    }

    @Test
    public void testMarkAsUnread() {
        // TASK 1-A Email Utility unit test
        List<Email> expectedResult = new LinkedList<Email>();
        // TODO: add Emails to expectedResult as necessary
        Assert.assertEquals(this.testUtilities.markAsUnread(), expectedResult);
    }

    @Test
    public void testUnreadMessagesFrom() {
        // TASK 1-A Email Utility unit test
        List<Email> expectedResult = new LinkedList<Email>();
        // TODO: add Emails to expectedResult as necessary
        Assert.assertEquals(this.testUtilities.unreadMessagesFrom("milda@brown.edu"), expectedResult);
    }

    @Test
    public void testMessagesAbout() {
        // TASK 1-A Email Utility unit test
        List<Email> expectedResult = new LinkedList<Email>();
        // TODO: add Emails to expectedResult as necessary
        Assert.assertEquals(this.testUtilities.messagesAbout("cs200"), expectedResult);
    }

    @Test
    public void testUnreadFrom() {
        // TASK 1-A Email Utility unit test
        List<String> expectedResult = new LinkedList<String>();
        // TODO: add Strings to expectedResult as necessary
        Assert.assertEquals(this.testUtilities.unreadFrom(), expectedResult);
    }

    @Test
    public void testRainfall() {
        // TASK 2-A
        double delta = 0.0001;

        Rainfall r1 = new Rainfall(Arrays.asList(1, -2, 5, -999, 8));
        Assert.assertEquals(r1.getAverage(), 3,  delta);

        // TODO: add more tests
    }

    @Test
    public void testCheckout() {
        // TASK 3-A
        double delta = 0.0001;
        // Mix of items
        Cart c1 = new Cart(Arrays.asList(new Item("shoes", 25),
                new Item("bag", 50),
                new Item("shoes", 85),
                new Item("hat",15)));
        Assert.assertEquals(c1.checkout(), (25 + 50 + 85 + 15) - ((25 + 85) * 0.2), delta);

        // TODO: add more tests and annotate why you chose the examples that you chose
    }
}
