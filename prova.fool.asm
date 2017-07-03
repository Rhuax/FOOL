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
lfp
push 1
push -5
lfp
add
lw
push 0
add
lw
push -5
lfp
add
lw
push 1
add
lw
push -5
lfp
add
lw
push 2
add
lw
push 5
lfp
push function0
js
lfp
push 1
push 7
push -5
lfp
add
lw
push 0
add
lw
push -5
lfp
add
lw
push 1
add
lw
push -5
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
push 1
push 9
srv
pop
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
push 0
lfp
add
lw
push 1
lfp
add
lw
bg label2
push 0
b label3
label2:
push 1
label3:
push 1
beq label0
push 0
lfp
add
lw
push 1
lfp
add
lw
sub
b label1
label0:
push 0
lfp
add
lw
push 1
lfp
add
lw
add
label1:
srv
sra
pop
pop
pop
pop
pop
sfp
lrv
lra
js
