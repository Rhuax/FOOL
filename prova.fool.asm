push 0
push function0

lhp
push 9
lhp
sw
lhp
push 1
add
shp
push 22
push -3
lfp
add
lw
push 0
add
lw
lfp
push 4
lfp
push function0
js
srv
lrv
print
halt

function0:
cfp
pop
lfp
add
sfp
lra
push 33
srv
sra
pop
sfp
lrv
lra
js

function0:
cfp
pop
lfp
add
sfp
lra
push function0
lfp
lfp
push -3
lfp
add
lw
js
srv
lrv
srv
pop
sra
pop
sfp
lrv
lra
js
