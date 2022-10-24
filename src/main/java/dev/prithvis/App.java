package dev.prithvis;

/**
 * A basic class to learn sonar and jacoco
 *
 */
public class App 
{
    private static System.Logger logger=System.getLogger(App.class.getName());
    public static void main( String[] args )
    {
        logger.log(System.Logger.Level.INFO,"Hi this is sonar project");
    }
}
