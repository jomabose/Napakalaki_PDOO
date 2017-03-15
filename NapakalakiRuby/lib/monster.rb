#encoding: utf-8
# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class Monster
  def initialize(n, l, b, p)
    @name = n
    @combatLevel = l
    @badConsequence = b
    @prize = p
  end
  
  attr_reader :name
  attr_reader :combatLevel
  attr_reader :badConsequence
  
  def getLevelsGained
    return @prize.levels
  end
  
  def getTreasuresGained
    return @prize.treasures
  end
  
  #NO UML
  
  def to_s
    cadena = "Name: #{@name} \nCombat_Level: #{@combatLevel}"
    cadena += "\nPrize: #{@prize} \nBad_Consequence: #{@badConsequence}"
    cadena += "\n\n"
    return cadena
  end
  
end
