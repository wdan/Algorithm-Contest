n = input()
s = "<3"
for i in xrange(n):
    s += raw_input()
    s += "<3"
ans = raw_input()
slen = len(s)
alen = len(ans)
index = 0
for i in xrange(alen):
    if ans[i] != s[index]:
        continue
    index += 1
    if index == slen:
        break
if index == slen:
    print "yes"
else:
    print "no"
