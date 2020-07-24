/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemoncardgame.models;

/**
 *
 * @author askilic
 */
public class Pokemon {

    private String pokemonName;
    private int pokemonID;
    private String pokemonType;
    private boolean isUsed;
    private String pokemonURL;

    public Pokemon() {

    }

    public Pokemon(String pokemonName, String pokemonType) {
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
    }
    
    public Pokemon(String pokemonName, String pokemonType, String pokemonURL) {
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
        this.pokemonURL = pokemonURL;
    }

    public String getPokemonURL() {
        return pokemonURL;
    }

    public void setPokemonURL(String pokemonURL) {
        this.pokemonURL = pokemonURL;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public int getPokemonID() {
        return pokemonID;
    }

    public void setPokemonID(int pokemonID) {
        this.pokemonID = pokemonID;
    }

    public String getPokemonType() {
        return pokemonType;
    }

    public void setPokemonType(String pokemonType) {
        this.pokemonType = pokemonType;
    }

    public boolean isIsUsed() {
        return isUsed;
    }

    public void setIsUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }
    
    public int showAttackPower(){
        // to overriding in other class who have inheritence to Pokemon
        return -1;
    }
}
