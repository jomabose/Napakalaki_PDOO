#encoding: utf-8
# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

module NapakalakiGame

require 'singleton'

class CardDealer
  include Singleton
  
  @unusedMonsters
  @usedMonsters
  @unusedTreasures
  @usedTreasures
  
  private
  def initTreasureCardDeck
    #No se sabe
  end
  
  private
  def initMonsterCardDeck
    #No se sabe
  end
  
  private
  def shuffleTreasures
    #No se sabe
  end
  
  private
  def shuffleMonster
    #No se sabe
  end
  
  def nextTreasure
    #No se sabe
  end
  
  def nextMonster
    #No se sabe
  end
  
  def giveTreasureBack(t)
    #No se sabe
  end
  
  def giveMonsterBack(m)
    #No se sabe
  end
  
  def initCards
    #No se sabe
  end

end
end
