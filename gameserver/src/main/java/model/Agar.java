package model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/**
 * Created by sl on 10.10.2016.
 */
public class Agar {
    private static final Logger log = LogManager.getLogger(Food.class);
    private final Player Owner;

    public Agar(@NotNull Player owner){
        Owner=owner;
        if (log.isInfoEnabled())
            log.info("Agar created with owner"+owner+"created");
    }
}