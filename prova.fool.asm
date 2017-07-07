push 0
push function0

push function1

push function2

push function3

lhp
lhp
lhp
push 2
add
shp
push 7
srv
sra
lrv
lra
sw
lra
push 1
add
push 0
srv
sra
lrv
lra
sw
lhp
lhp
lhp
push 2
add
shp
push 6
srv
sra
lrv
lra
sw
lra
push 1
add
push 1
srv
sra
lrv
lra
sw
lfp
lfp
lfp
push -7
add
lw
push function0
js
lfp
lfp
lfp
push -7
add
lw
push function3
js
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
push 3
add
lw
push 1
beq label0
push 0
b label1
label0:
lfp
push -1
add
lw
push 2
add
lw
push 15
bleq label4
push 0
b label5
label4:
push 1
label5:
push 1
beq label2
push 1
b label3
label2:
push 15
lfp
push -1
add
lw
push 2
add
lw
sub
label3:
label1:
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
lfp
push -1
add
lw
push 5
add
lw
push 1
beq label6
push 0
b label7
label6:
lfp
push -1
add
lw
push 4
add
lw
push 8
bleq label10
push 0
b label11
label10:
push 1
label11:
push 1
beq label8
push 1
b label9
label8:
push 8
lfp
push -1
add
lw
push 4
add
lw
sub
label9:
label7:
srv
sra
pop
pop
sfp
lrv
lra
js
