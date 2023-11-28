package sample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLogs {
    public static void main(String[] args) {
        Logger log = LogManager.getLogger(TestLogs.class.getName());

        log.error("Test error new");
        log.info("This is information log");
        log.debug("This is debug log");
    }
}
