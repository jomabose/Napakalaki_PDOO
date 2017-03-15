#encoding: utf-8
# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class Player
  
  MAXLEVEL = 10
  
  def initialize(name)
    @name = name
    @level = 1
    @dead = true    
    @pendingBadConsequence = badConsequence.new
    @visibleTreasures = Array.new
    @hiddenTreasures = Array.new
  end
  
  attr_reader :name
  attr_reader :level
  attr_reader :visibleTreasures
  attr_reader :hiddenTreasures
  
  private
  def bringToLife
    @dead = false
  end
  
  private
  def getCombatLevel
    @visibleTreasures.each do |elemento|
      bonusTreasures += elemento.bonus
    end
    return @level + bonusTreasures
  end
  
  private
  def incrementLevels(l)
    @level + l
    if(@level > MAXLEVEL)
      @level = MAXLEVEL
    end
  end
  
  private
  def decrementLevels(l)
     @level - l
    if(@level < 1)
      @level = 1
    end
  end
  
  private
  def setPendingBadConsequence(b)
    @pendingBadConsequence = b
  end
  
  private
  def applyPrize(m)
    #No se sabe
  end
  
  private
  def applyBadConsequence(m)
    #No se sabe
  end
  
  private
  def canMakeTreasureVisible(t)
    #No se sabe
  end
  
  private
  def howManyVisibleTreasures(tKind)
    #No se sabe
  end
  
  private
  def dieIfNoTreasures
    if @hiddenTreasures.empty? && @visibleTreasures.empty?
      @dead = true
    end
  end
  
  def isDead
    return @dead
  end
  
  def combat(m)
    #No se sabe
  end
  
  def makeTreasureVisible
    #No se sabe
  end
  
  def discardVisibleTreasure(t)
    #No se sabe
  end
  
  def discardHiddenTreasure(t)
    #No se sabe
  end
  
  def validState
    #No se sabe
  end
  
  def initTreasures
    #No se sabe
  end
  
  def discardAllTreasures
    #No se sabe
  end
end
