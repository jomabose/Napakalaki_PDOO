#encoding: utf-8
# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

module NapakalakiGame

require 'singleton'

class Napakalaki
  include Singleton
  
  def initialize
    @currentPlayerIndex
    @currentMonster
    @currentPlayer
    @players
    @dealer
  end

  private
  def initPlayers(names)
    #No se sabe
  end
  
  private
  def nextPlayer
    #No se sabe
  end
  
  private 
  def nextTurnAllowed
    #No se sabe
  end
  
  def developCombat
    #No se sabe
  end
  
  def discardVisibleTreasures(treasures)
    #No se sabe
  end
  
  def discardHiddenTreasures(treasures)
    #No se sabe
  end
  
  def makeTreasuresVisible(treasures)
    #No se sabe
  end
  
  def initGame(players)
    
  end
  
  def getCurrentPlayer
    #No se sabe
  end
  
  def getCurrentMonster
    #No se sabe
  end
  
  def nextTurn
    #No se sabe
  end
  
  def endOfGame(result)
    #No se sabe
  end 
end

end