push 0
push function0
lfp
push 7
lfp
push -2
lfp
add
lw
js
halt

function0:
cfp
lra
push 1
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
