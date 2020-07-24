/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemoncardgame;

import java.util.List;
import java.util.Random;
import pokemoncardgame.models.Pokemon;

/**
 *
 * @author askilic
 */
public class ComputerGamer extends Gamer {
    private List<Pokemon> cardList;
    
    @Override
    void cardChoice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Pokemon getRandomCard()
    {
        if (cardList.isEmpty())
        {
            return null;
        }
        
        Random r = new Random();
        int index = r.nextInt(cardList.size());
        Pokemon p = cardList.get(index);
        cardList.remove(index);
        return p;
    }
    
    /**
     * @return the cardList
     */
    public List<Pokemon> getCardList() {
        return cardList;
    }

    /**
     * @param cardList the cardList to set
     */
    public void setCardList(List<Pokemon> cardList) {
        this.cardList = cardList;
    }

    @Override
    public void setWhois(boolean whois) {
        whois = true;
        super.setWhois(whois); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
