#encoding: utf-8
# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class Monster
  def initialize(name, level, bc, prize)
    @name = name
    @level = level
    @bc = bc
    @prize = prize
  end
  
  attr_reader :name
  attr_reader :level
  attr_reader :bc
  attr_reader :prize
  
  def to_s
    cadena = "Name: #{@name} \nCombat_Level: #{@level}"
    cadena += "\nPrize: #{@prize} \nBad_Consequence: #{@bc}"
    cadena += "\n\n"
  end
end
