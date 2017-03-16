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
public class CardDealer {
    private static final CardDealer instance = new CardDealer();
    
    private ArrayList<Treasure> unusedTreasures;
    private ArrayList<Treasure> usedTreasures;
    private ArrayList<Monster> unusedMonsters;
    private ArrayList<Monster> usedMonsters;
    
    
    private CardDealer() {
        unusedTreasures = new ArrayList();
        usedTreasures = new ArrayList();
        unusedMonsters = new ArrayList();
        usedMonsters = new ArrayList();
    
    }
    
    private void initTreasureCardDeck(){
       unusedTreasures.add(new Treasure("¡Sí, mi amo!",3,TreasureKind.HELMET));
       unusedTreasures.add(new Treasure("Botas de investigación",3,TreasureKind.SHOES));
       unusedTreasures.add(new Treasure("Capucha de Cthulhu",3,TreasureKind.HELMET));
       unusedTreasures.add(new Treasure("A prueba de babas",2,TreasureKind.ARMOR));
       unusedTreasures.add(new Treasure("Botas de lluvia ácida",1,TreasureKind.BOTHHANDS));
       unusedTreasures.add(new Treasure("Casco minero",2,TreasureKind.HELMET));
       unusedTreasures.add(new Treasure("Ametralladora ACME",1,TreasureKind.BOTHHANDS));
       unusedTreasures.add(new Treasure("Camiseta de la ETSIIT",1,TreasureKind.ARMOR));
       unusedTreasures.add(new Treasure("Clavo de rail ferroviario",3,TreasureKind.ONEHAND));
       unusedTreasures.add(new Treasure("Cuchillo de sushi arcano",2,TreasureKind.ONEHAND));
       unusedTreasures.add(new Treasure("Fez alópodo",3,TreasureKind.HELMET));
       unusedTreasures.add(new Treasure("Hacha prehistórica",2,TreasureKind.ONEHAND));
       unusedTreasures.add(new Treasure("El aparato del Pr. Tesla",4,TreasureKind.ARMOR));
       unusedTreasures.add(new Treasure("Gaita",4,TreasureKind.BOTHHANDS));
       unusedTreasures.add(new Treasure("Insecticida",2,TreasureKind.ONEHAND));
       unusedTreasures.add(new Treasure("Escopeta de 3 cañones",4,TreasureKind.BOTHHANDS));
       unusedTreasures.add(new Treasure("Garabato mísitco",2,TreasureKind.ONEHAND));
       unusedTreasures.add(new Treasure("La rebeca metálica",32,TreasureKind.ARMOR));
       unusedTreasures.add(new Treasure("Lanzallamas",4,TreasureKind.BOTHHANDS));
       unusedTreasures.add(new Treasure("Necrocomicón",1,TreasureKind.ONEHAND));
       unusedTreasures.add(new Treasure("Necronomicón",5,TreasureKind.BOTHHANDS));
       unusedTreasures.add(new Treasure("Linterna a 2 manos",3,TreasureKind.BOTHHANDS));
       unusedTreasures.add(new Treasure("Necrognomicón",2,TreasureKind.ONEHAND));
       unusedTreasures.add(new Treasure("Necrotelecom",2,TreasureKind.HELMET));
       unusedTreasures.add(new Treasure("Mazo de los antiguos",3,TreasureKind.ONEHAND));
       unusedTreasures.add(new Treasure("Necroplayboycón",3,TreasureKind.ONEHAND));
       unusedTreasures.add(new Treasure("Porra preternatural",2,TreasureKind.ONEHAND));
       unusedTreasures.add(new Treasure("Shogulador",1,TreasureKind.BOTHHANDS));
       unusedTreasures.add(new Treasure("Varita de atizamiento",3,TreasureKind.ONEHAND));
       unusedTreasures.add(new Treasure("Tentáculo de pega",2,TreasureKind.HELMET));
       unusedTreasures.add(new Treasure("Zapato deja-amigos",1,TreasureKind.SHOES));
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
    
    public static CardDealer getInstance() {
        return instance;
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
