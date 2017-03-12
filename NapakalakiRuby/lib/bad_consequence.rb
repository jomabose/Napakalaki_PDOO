#encoding: utf-8
# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class BadConsequence
=begin
  def initialize()
    @text = ""
    @levels = 0
    @nVisibleTreasures = 0
    @nHiddenTreasures = 0
    @death = false
    @specificVisibleTreasures = Array.new
    @specificHiddenTreasures = Array.new
  end
=end
  
  def initialize(aText, someLevels, someVisibleTreasures, someHiddenTreasures,
      someSpecificVisibleTreasures, someSpecificHiddenTreasures, death)
    @text = aText
    @levels = someLevels
    @nVisibleTreasures = someVisibleTreasures
    @nHiddenTreasures = someHiddenTreasures
    @death = death
    @specificVisibleTreasures = someSpecificVisibleTreasures
    @specificHiddenTreasures = someSpecificHiddenTreasures
  end
  
  def BadConsequence.newLevelNumberOfTreasures(aText, someLevels, someVisibleTreasures, someHiddenTreasures)
    BadConsequence.new(aText, someLevels, someVisibleTreasures, someHiddenTreasures, Array.new, Array.new, false)
  end
  
  def BadConsequence.newLevelSpecificTreasures (aText, someLevels, someSpecificVisibleTreasures, someSpecificHiddenTreasures)
    BadConsequence.new(aText, someLevels, -1, -1, someSpecificVisibleTreasures, someSpecificHiddenTreasures, false)
  end  
    
  def BadConsequence.newDeath (aText)
    BadConsequence.new(aText, 9999999, 9999999, 9999999, Array.new, Array.new, true)
  end  
    
  attr_reader :text
  attr_reader :levels
  attr_reader :nVisibleTreasures
  attr_reader :nHiddenTreasures
  attr_reader :death
  attr_reader :specificVisibleTreasures
  attr_reader :specificHiddenTreasures
  
  def to_s
    cadena = "#{@text}" 
    if @death
      cadena += "\nDeath = #{@death}"
    else
      if @levels != 0
        cadena += "\nLevels_Down = #{@levels}"
      end
      if @nVisibleTreasures != -1 && (@nVisibleTreasures != 0 || @nHiddenTreasures !=0)
        cadena += "\nRandom_Visible_Treasures_Down = #{@nVisibleTreasures} / Random_Hidden_Treasures_Down = #{@nHiddenTreasures}"
      end
      if @nVisibleTreasures == -1
         cadena += "\nSpecific_Visible_Treasures_Down = #{@specificVisibleTreasures} / Specific_Hidden_Treasures_Down = #{@specificHiddenTreasures}"
       end
    end 
  end
end