/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;
import java.util.*;

/**
 *
 * @author danibolanos
 */

public class BadConsequence {
    
    static final int MAXTREASURES = 10;
    
    private String text;
    private int levels;
    private int nVisibleTreasures;
    private int nHiddenTreasures;
    private boolean death;
    private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();
    private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList();
    
    
    public BadConsequence(String text, int levels, int nVisible, int nHidden){
        this.text = text;
        this.levels = levels;
        nVisibleTreasures = nVisible;
        nHiddenTreasures = nHidden;
        death = false; 
        specificVisibleTreasures = new ArrayList();
        specificHiddenTreasures = new ArrayList();
    }
    
    public BadConsequence(String text, boolean death){
        this.text = text;
        this.death = death;     
        levels = Integer.MAX_VALUE;
        nVisibleTreasures = Integer.MAX_VALUE;
        nHiddenTreasures = Integer.MAX_VALUE;
        specificVisibleTreasures = new ArrayList();
        specificHiddenTreasures = new ArrayList();
    }
    
    public BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible,
           ArrayList<TreasureKind> tHidden){
        this.text = text;
        this.levels = levels;
        specificVisibleTreasures = tVisible;
        specificHiddenTreasures = tHidden;
        death = false;
        //-1 Indica que el mal rollo afecta solo a tesoros específicos
        nVisibleTreasures = -1;
        nHiddenTreasures = -1;
    }
    
    public String getText(){
        return text;
    }
    
    public int getLevels(){
        return levels;
    }
    
    public int getNumberVisible(){
        return nVisibleTreasures;
    }
    
    public int getNumberHidden(){
        return nHiddenTreasures;
    }
    
    public ArrayList getSpecificVisible(){
        return specificVisibleTreasures;
    }
    
    public ArrayList getSpecificHidden(){
        return specificHiddenTreasures;
    }
    
    public boolean getDeath(){
        return death;
    }

    public String toString(){
        String cadena = text; 
           if(death)
               cadena += "\nDeath = " + death;
           else{
           if(levels != 0)
               cadena += " \nLevels_Down = " + Integer.toString(levels);
           if(nVisibleTreasures != -1 && (nVisibleTreasures != 0 || nHiddenTreasures !=0))
               cadena += "\nRandom_Visible_Treasures_Down = " + Integer.toString(nVisibleTreasures) 
               + " / Random_Hidden_Treasures_Down = " + Integer.toString(nHiddenTreasures);
           if(nVisibleTreasures == -1)
               cadena += "\nSpecific_Visible_Treasures_Down = " + getSpecificVisible()
               + " / Specific_Hidden_Treasures_Down = " + getSpecificHidden();
           }
        return cadena;
    }
    
    public boolean isEmpty(){
        //No se sabe todavía
    }
    
    public void substractVisibleTreasure(Treasure t){
        //No se sabe todavía
    }
    
    public void substractHiddenTreasure(Treasure t){
        //No se sabe todavía
    }
    
}