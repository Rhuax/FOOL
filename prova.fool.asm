push 0
push function0

lhp
push 5
lhp
sw
lhp
push 1
add
shp
lfp
lfp
lfp
push -3
add
lw
push function0
js
print
halt

function1:
cfp
lra
lfp
push -1
add
lw
push 0
add
lw
srv
sra
pop
sfp
lrv
lra
js

function0:
cfp
push 1
lfp
add
sfp
lra
push function1
lfp
lfp
lfp
push -1
add
lw
push -3
lfp
add
lw
js
srv
pop
sra
pop
pop
sfp
lrv
lra
js
