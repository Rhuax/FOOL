push 0
push 3
push function0
lfp
lfp
push -3
lfp
add
lw
js
print
halt

function0:
cfp
lra
push -2
lfp
lw
add
lw
push 3
bgeq label2
push 0
b label3
label2:
push 1
label3:
push 1
beq label0
push -2
lfp
lw
add
lw
push 1
sub
b label1
label0:
push -2
lfp
lw
add
lw
push 1
add
label1:
srv
sra
pop
sfp
lrv
lra
js
