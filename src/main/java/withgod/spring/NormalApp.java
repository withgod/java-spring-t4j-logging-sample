package withgod.spring;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;

import java.util.logging.Logger;

public class NormalApp 
{
    protected static Logger logger = Logger.getLogger(NormalApp.class.getName());
    public static void main( String[] args ) throws TwitterException {
        Twitter tw = (new TwitterFactory()).getInstance();
        User self = tw.verifyCredentials();
        logger.info("I'm ["+ self.getScreenName() + "/" + self.getId() + "]");
        User who = tw.showUser("twitterapi");
        logger.info("twitterapi is  ["+ who.getScreenName() + "/" + who.getId() + "]");
    }
}
