package withgod.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.User;

import java.util.logging.Logger;

public class SpringApp
{
    protected static Logger logger = Logger.getLogger(SpringApp.class.getName());
    public static void main( String[] args ) throws TwitterException {
        ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[] {"spring.xml"});

        Twitter tw = (Twitter)appContext.getBean("twitterProxy");
        User self = tw.verifyCredentials();
        logger.info("I'm ["+ self.getScreenName() + "/" + self.getId() + "]");
        User who = tw.showUser("twitterapi");
        logger.info("twitterapi is  ["+ who.getScreenName() + "/" + who.getId() + "]");
    }
}
