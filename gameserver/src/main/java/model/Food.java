package model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by sl on 10.10.2016.
 */
public class Food {
    private static final Logger log = LogManager.getLogger(Food.class);
    public Food(){
        if (log.isInfoEnabled())
            log.info("Food created");
    }
}
