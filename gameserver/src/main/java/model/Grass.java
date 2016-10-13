package model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by sl on 10.10.2016.
 */
public class Grass {
    private static final Logger log = LogManager.getLogger(GameField.class);
    public Grass(){
        if (log.isInfoEnabled())
            log.info("Grass created");
    }
}
