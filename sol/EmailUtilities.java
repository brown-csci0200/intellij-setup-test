package sol;

import src.Email;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class representing utilities that can be used to work with an inbox of Emails
 */
public class EmailUtilities {

    /**
     * Field representing the inbox (a list of Emails)
     */
    private List<Email> emails;

    /**
     * Constructor for EmailUtilities
     *
     * @param emails    the list of Emails that represent an inbox
     */
    public EmailUtilities(List<Email> emails) {
        // TODO: Javadoc
        // Copies over the list of emails
        this.emails = new LinkedList<Email>(emails);
    }

    /**
     * Method to get all of the unread emails in the inbox
     *
     * @return  a List of all Emails in the inbox where the isRead field is false
     */
    // UNCOMMENT WHEN READY TO IMPLEMENT
    // public List<Email> getAllUnread() { }

    /**
     * Method that returns all of the emails in the inbox, marked as unread
     *
     * @return a List of all Emails from the inbox, but with the isRead field marked as false
     */
    // UNCOMMENT WHEN READY TO IMPLEMENT
    // public List<Email> markAsUnread() { }

    /**
     * Method that returns all of the unread Emails in the inbox from a specific sender
     *
     * @param sender    the email address of the sender
     * @return          a List of all unread Emails in the inbox that are from the sender
     */
    // UNCOMMENT WHEN READY TO IMPLEMENT
    // public List<Email> unreadMessagesFrom(String sender) { }

    /**
     * Method that returns all of the Emails in the inbox about a specific topic
     *
     * @param topic the topic to search for
     * @return      a List of all of the Emails from the inbox where the message text contains the topic as a substring
     */
    // UNCOMMENT WHEN READY TO IMPLEMENT
    // public List<Email> messagesAbout(String topic) { }

    /**
     * Method that returns all of the usernames of senders from which unread emails exist in the inbox
     * A username is the portion of the email address that comes before the "@"
     *
     * @return  a List of all of the distinct usernames from which unread emails exist in the inbox
     */
    // UNCOMMENT WHEN READY TO IMPLEMENT
    // public List<String> unreadFrom() { }
}
