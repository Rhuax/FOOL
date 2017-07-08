push 0
lhp
lhp
lhp
push 1
add
shp
pop
push function0
push function1
lfp
lfp
lfp
push -3
lfp
add
lw
js
lfp
push -4
lfp
add
lw
js
print
halt

function0:
cfp
lra
lhp
lhp
lhp
push 2
add
shp
push -2
lfp
lw
add
lw
srv
sra
lrv
lra
sw
srv
sra
pop
sfp
lrv
lra
js

function1:
cfp
lra
push 2
srv
sra
pop
pop
sfp
lrv
lra
js
