push 0
push function0

push function1

push function2

lhp
lhp
lhp
push 1
add
shp
push 1
srv
sra
lrv
lra
sw
lfp
lfp
lfp
push -5
add
lw
push function0
js
lfp
lfp
lfp
push -6
add
lw
push function2
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
lhp
lhp
lhp
push 2
add
shp
lfp
push -1
add
lw
push 0
add
lw
srv
sra
lrv
lra
sw
lra
push 1
add
push 2
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

function2:
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
push 2
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
