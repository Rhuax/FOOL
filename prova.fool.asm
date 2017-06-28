push 0
push function0
lfp
push 2
lfp
push -2
lfp
add
lw
js
print
halt

function0:
cfp
lra
push 1
lfp
add
lw
push 0
bg label2
push 0
b label3
label2:
push 1
label3:
push 1
beq label0
push 0
b label1
label0:
push 1
label1:
srv
sra
pop
pop
sfp
lrv
lra
js
