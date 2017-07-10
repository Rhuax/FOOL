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
pop
lhp
lhp
lhp
push 2
add
shp
push -5
lfp
add
lw
srv
sra
lrv
lra
sw
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
push 44
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
push 555
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
lfp
lfp
push -1
add
lw
push 0
add
lw
push function0
js
srv
sra
pop
pop
sfp
lrv
lra
js
