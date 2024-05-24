package Log;
import org.apache.logging.log4j.*;

public class LoggerDemo {

    public static void main(String[] args) {

        Logger log =  LogManager.getLogger("LoggerDemo");
        System.out.println("LoggerDemo");
        log.info("for info");
        log.debug("for debug");
        log.error("for error");
        log.warn("for warn");


    }
}
