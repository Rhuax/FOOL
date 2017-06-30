push 0
push function0

push function1

push 1
push 3
halt

function0:
cfp
lra
push -2
lfp
lw
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
