#!/usr/bin/env ruby
require "set"

set = Set.new(gets.chop.chars)
if set.size() % 2 == 0 then
  puts "CHAT WITH HER!"
else
  puts "IGNORE HIM!"
end
