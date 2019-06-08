package utils;
import org.apache.log4j.Logger;


public class Loggers {


static final Logger logger = Logger.getLogger(Loggers.class);


public static void Info(String infoContext)
{
    logger.info(infoContext);
}

public static void Debug(String debugContext)
{

    logger.debug(debugContext);

}


}
