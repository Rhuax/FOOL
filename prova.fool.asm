push 0
push function0

push function1

push function2

lhp
push 7
lhp
sw
push 8
lhp
push 1
add
shp
lhp
sw
lhp
push 1
add
shp
lfp
push 9
lfp
lfp
push -5
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
push 1
lfp
add
lw
lfp
lfp
push -1
add
lw
push function1
js
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
push 1
lfp
add
lw
lfp
push -1
add
lw
push 0
add
lw
add
lfp
lfp
push -1
add
lw
push function2
js
srv
sra
pop
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
push 1
lfp
add
lw
lfp
push -1
add
lw
push 1
add
lw
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
