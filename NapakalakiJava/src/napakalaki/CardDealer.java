/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author danibolanos
 */
public class CardDealer {
    private Treasure unusedTreasures;
    private Treasure usedTreasures;
    private Monster unusedMonsters;
    private Monster usedMonsters;
    
    
    private CardDealer() {
    }
    
    public static CardDealer getInstance() {
        return CardDealerHolder.INSTANCE;
    }
    
    private static class CardDealerHolder {
        private static final CardDealer INSTANCE = null;
    }
    
    private void initTreasureCardDeck(){
     //No se sabe todavía  
    }
    
    private void initMonsterCardDeck(){
        //No se sabe todavía
    }
    
    private void shuffleTreasures(){
        //No se sabe todavía
    }
    
    private void shuffleMonsters(){
        //No se sabe todavía
    }
    
    public Treasure nextTreasure(){
        //No se sabe todavía
    }
    
    public Monster nextMonster(){
        //No se sabe todavía
    }
    
    public void giveTreasureBack(Treasure t){
        //No se sabe todavía
    }
    
    public void giveMonsterBack(Monster m){
        //No se sabe todavía
    }
    
    public void initCards(){
        //No se sabe todavía
    }
}
