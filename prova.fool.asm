push 0
push function0

push function1

lhp
lhp
lhp
push 2
add
shp
push 0
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
push 2
add
shp
push 1
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
push 2
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
lrv
lra
sw
lfp
lfp
lfp
push -4
add
lw
push function1
js
lfp
lfp
lfp
push -4
add
lw
push function0
js
lfp
lfp
lfp
push -5
add
lw
push function0
js
push 1
sub
beq label0
push 0
b label1
label0:
push 1
label1:
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
push 1
lfp
add
sfp
lra
lfp
push -1
add
lw
push 1
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
