#encoding: utf-8
# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

module NapakalakiGame

class Treasure
  def initialize(n, bonus, t)
    @name = n
    @bonus = bonus
    @type = t
  end
  
  attr_reader :name
  attr_reader :bonus
  attr_reader :type
  
end

end
