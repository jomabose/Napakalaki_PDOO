#encoding: utf-8
# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class Prize
  def initialize(t, l)
    @treasures = t
    @levels = l
  end
  
  attr_reader :treasures
  attr_reader :levels
  
  #NO UML
  
  def to_s
    cadena = "Treasures = #{@treasures} / Levels = #{@levels}"
    return cadena 
  end
end 
