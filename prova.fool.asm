push 0
push function0

push function1

push function2

push function3

lhp
push 1
lhp
sw
push 2
lhp
push 1
add
shp
lhp
sw
push 3
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
lhp
push 4
lhp
sw
push 5
lhp
push 1
add
shp
lhp
sw
push 6
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
push -6
lfp
add
lw
push 0
add
lw
push -6
lfp
add
lw
push 1
add
lw
push -6
lfp
add
lw
push 2
add
lw
push 5
lfp
push function3
js
lfp
push -7
lfp
add
lw
push 0
add
lw
push -7
lfp
add
lw
push 1
add
lw
push -7
lfp
add
lw
push 2
add
lw
push 5
lfp
push function2
js
add
print
halt

function0:
cfp
pop
lfp
add
sfp
lra
push -1
lfp
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
pop
lfp
add
sfp
lra
push -2
lfp
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
pop
lfp
add
sfp
lra
push -3
lfp
add
lw
push -2
lfp
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

function3:
cfp
pop
lfp
add
sfp
lra
push -3
lfp
add
lw
push -1
lfp
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
