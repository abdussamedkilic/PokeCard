/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemoncardgame;

/**
 *
 * @author askilic
 */
public abstract class Gamer {

    private int gamerID;
    private String gamerName;
    private int score;
    private boolean whois;

    public int getGamerID() {
        return gamerID;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setGamerID(int gamerID) {
        this.gamerID = gamerID;
    }

    public String getGamerName() {
        return gamerName;
    }

    public void setGamerName(String gamerName) {
        this.gamerName = gamerName;
    }

    public Gamer() {

    }

    public Gamer(int gamerID, String gamerName) {
        this.gamerID = gamerID;
        this.gamerName = gamerName;
    }

    public boolean isWhois() {
        return whois;
    }

    public void setWhois(boolean whois) {
        this.whois = whois;
    }
    
    abstract void cardChoice();

}
