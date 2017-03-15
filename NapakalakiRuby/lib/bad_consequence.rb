#encoding: utf-8
# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class BadConsequence
  
  MAXTREASURES = 10
  
  def initialize(t, l, nVisible, nHidden, v, h, death)
    @text = t
    @levels = l
    @nVisibleTreasures = nVisible
    @nHiddenTreasures = nHidden
    @death = death
    @specificVisibleTreasures = v
    @specificHiddenTreasures = h
  end
  
  def isEmpty
    #No se sabe
  end

  attr_reader :levels
  attr_reader :nVisibleTreasures
  attr_reader :nHiddenTreasures
  attr_reader :specificHiddenTreasures
  attr_reader :specificVisibleTreasures
  
  def substractVisibleTreasure(t)
    #No se sabe
  end
  
  def substractHiddenTreasure(t)
    #No se sabe
  end

  def BadConsequence.newLevelNumberOfTreasures(t, l, nVisible, nHidden)
    BadConsequence.new(t, l, nVisible, nHidden, Array.new, Array.new, false)
  end
  
  def BadConsequence.newLevelSpecificTreasures (t, l, v, h)
    BadConsequence.new(t, l, -1, -1, v, h, false)
  end  
    
  def BadConsequence.newDeath (t)
    BadConsequence.new(t, 9999999, 9999999, 9999999, Array.new, Array.new, true)
  end  
  
  def adjustToFitTreasureLists(v,h)
    #No se sabe
  end

  # NO UML  

  def to_s
    cadena = "#{@text}" 
    if @death
      cadena += "\nDeath = #{@death}"
    else 
      if @levels != 0
        cadena += "\nLevels_Down = #{@levels}"
      end
      if @nVisibleTreasures == -1
         cadena += "\nSpecific_Visible_Treasures_Down = #{@specificVisibleTreasures} / Specific_Hidden_Treasures_Down = #{@specificHiddenTreasures}"
      else
         cadena += "\nRandom_Visible_Treasures_Down = #{@nVisibleTreasures} / Random_Hidden_Treasures_Down = #{@nHiddenTreasures}"
      end
    end 
    return cadena
  end
  
  attr_reader :death

end