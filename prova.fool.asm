push 0
push function0

lhp
push 44
lhp
push 1
add
shp
lhp
sw
lfp
lfp
push function0
js
halt

function0:
cfp
lra
push 33
srv
sra
pop
sfp
lrv
lra
js
