push 0
push function0

push function1

lhp
lhp
lhp
push 1
add
shp
pop
lfp
push 999
lfp
lfp
push -4
add
lw
push function1
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
push 1
lfp
add
lw
push 0
beq label2
push 0
b label3
label2:
push 1
label3:
push 1
beq label0
lfp
push 1
lfp
add
lw
push 1
sub
lfp
lfp
push -1
add
lw
push function1
js
b label1
label0:
push 1
label1:
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
push 1
lfp
add
lw
push 0
beq label6
push 0
b label7
label6:
push 1
label7:
push 1
beq label4
lfp
push 1
lfp
add
lw
push 1
sub
lfp
lfp
push -1
add
lw
push function0
js
b label5
label4:
push 0
label5:
srv
sra
pop
pop
pop
sfp
lrv
lra
js
