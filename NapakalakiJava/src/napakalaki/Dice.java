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
public class Dice {
    
    private Dice() {
    }
    
    public static Dice getInstance() {
        return DiceHolder.INSTANCE;
    }
    
    private static class DiceHolder {
        private static final Dice INSTANCE = null;
    }
    
    public int nextNumber(){
        //No se sabe todavía
    }
}
