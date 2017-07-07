push 0
push function0

push function1

push function2

push function3

lhp
lhp
lhp
push 1
add
shp
push 5
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
push function0
js
lfp
lfp
lfp
push -6
add
lw
push function1
js
lfp
push 10
lfp
lfp
push -6
add
lw
push function2
js
lfp
lfp
lfp
push -6
add
lw
push function3
js
add
add
add
print
halt

function0:
cfp
push 1
lfp
add
sfp
lra
push 3
lfp
push -1
add
lw
push 0
add
lw
srv
pop
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
push 3
push -3
lfp
add
lw
srv
pop
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
push 1
lfp
add
lw
srv
sra
pop
pop
pop
sfp
lrv
lra
js

function4:
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

function3:
cfp
push 1
lfp
add
sfp
lra
push function4
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
