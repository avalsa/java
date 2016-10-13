package model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sl on 10.10.2016.
 */
public class GameSessionImpl implements GameSession {
    private final List<Player> players = new ArrayList<>();
    private int CountPlayers=0;
    private static int CountSessions=0;
    private final int IdSession;
    private static final Logger log = LogManager.getLogger(GameSessionImpl.class);
    private final GameField gameField=new GameField();

    public GameSessionImpl(){
        IdSession=++CountSessions;
        if (log.isInfoEnabled())
            log.info(String.format("GameSesion#%d created", IdSession));
    }

    @Override
    public String toString(){
        return ("GameSession#"+IdSession);
    }

    @NotNull
    public List<Player> getPlayers() {
        return new ArrayList<>(players);
    }

    @NotNull
    public Integer getCountPlayers() {
        return CountPlayers;
    }

    @Override
    public void join(@NotNull Player player) {
        if (CountPlayers==GameConstants.MAX_PLAYERS_IN_SESSION) {
            throw new ArrayIndexOutOfBoundsException();
        }
        CountPlayers++;
        players.add(player);
        if (log.isInfoEnabled())
            log.info(player + " joined " + this);
    }

}
