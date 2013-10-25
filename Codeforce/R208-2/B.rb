n = gets.to_i
pattern = "<3"
n.times do |i|
  pattern = pattern << gets.chomp
  pattern = pattern << "<3"
end
ans = gets
len = pattern.size()
index = 0
alen = ans.size()
alen.times do |i|
  next if (pattern[index]!=ans[i])
  break if index == len or alen - i < len - index
  index += 1
end
if index == len then
  puts "yes"
else
  puts "no"
end
