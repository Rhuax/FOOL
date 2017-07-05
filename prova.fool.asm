push 0
push function0

push function1

push 3
lhp
push 15
lhp
sw
lhp
push 1
add
shp
lhp
push 60
lhp
sw
lhp
push 1
add
shp
lfp
push -5
lfp
add
lw
lfp
lfp
push -6
add
lw
push function0
js
print
halt

function0:
cfp
push 1
lfp
add
sfp
lra
lfp
push -1
add
lw
push 0
add
lw
lfp
lfp
lfp
push 1
add
lw
push function1
js
add
srv
sra
pop
pop
pop
sfp
lrv
lra
js

function1:
cfp
push 1
lfp
add
sfp
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
pop
sfp
lrv
lra
js
