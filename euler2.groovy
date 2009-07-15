long curr = 0
long prev = 1
long answer2 = 0
long fib2 = 0
while (fib2 &lt; 4000000) {
fib2 = (curr + prev)
prev = curr
curr = fib2
if (fib2 % 2 == 0) {
answer2 += fib2
}
}
println answer2
