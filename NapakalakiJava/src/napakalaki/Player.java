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
public class Player {
    static final int MAXLEVEL = 10;
    
    private String name;
    private int level;
    private boolean dead;
    private boolean canISteal;
    private Player enemy;
    private Treasure visibleTreasures;
    private Treasure hiddenTreasures;
    private BadConsequence pendingBadConsequence;
    
    private void bringToLife(){
        //No se sabe
    }
    private int getCombatLevel(){
        //No se sabe
    }
    private void incrementLevels(int l){
        level+=l;
        if(level>MAXLEVEL)
            level=MAXLEVEL;
    }
    private void decrementLevels(int l){
        level-=l;
        if(level<1)
            level=1;
    }
    private void setPendingBadConsequence(BadConsequence b){
        pendingBadConsequence = b;
    }
    private void applyPrize(Monster m){
        //No se sabe
    }
    private void applyBadConsequence(Monster m){
        //No se sabe
    }
    private boolean canMakeTreasureVisible(Treasure t){
        //No se sabe
    }
    private int howManyVisibleTreasures(TreasureKind tKind){
        //No se sabe
    }
    private void dieIfNoTreasures(){
        //No se sabe
    }
}
