push 0
push function0

lhp
lhp
lhp
push 1
add
shp
pop
push function1
lhp
lhp
lhp
push 3
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
srv
sra
lrv
lra
sw
lra
push 1
add
lfp
lfp
push -4
lfp
add
lw
js
srv
sra
lrv
lra
sw
push 777
print
halt

function0:
cfp
push 1
lfp
add
sfp
lra
lhp
lhp
lhp
push 3
add
shp
lhp
lhp
lhp
push 1
add
shp
pop
srv
sra
lrv
lra
sw
lra
push 1
add
lhp
lhp
lhp
push 3
add
shp
lhp
lhp
lhp
push 1
add
shp
pop
srv
sra
lrv
lra
sw
lra
push 1
add
lhp
lhp
lhp
push 1
add
shp
pop
srv
sra
lrv
lra
sw
srv
sra
lrv
lra
sw
srv
sra
pop
pop
sfp
lrv
lra
js

function1:
cfp
lra
lfp
lfp
lfp
push -3
add
lw
push function0
js
srv
sra
pop
sfp
lrv
lra
js
