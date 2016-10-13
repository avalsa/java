package model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sl on 10.10.2016.
 */
public class GameField {
    private static final Logger log = LogManager.getLogger(GameField.class);
    private final List<Grass> grass=new ArrayList<>();
    private final List<Food> food=new ArrayList<>();
    private final List<Agar> agars=new ArrayList<>();

    public GameField(){
        grass.add(new Grass());
        food.add(new Food());
        agars.add(new Agar(new Player("somePlayer")));
        if (log.isInfoEnabled())
            log.info("GameField created");
    }

}
