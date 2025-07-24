import numpy as np

w0=1.0
w1=1.0
learning_rate=0.1
num_iterations=100

for t in range(num_iterations):
    
    w0_gradient=4*w1+6*w0-6
    w1_gradient=4*w1+4*w0-6

    w0=w0-learning_rate*w0_gradient
    w1=w1-learning_rate*w1_gradient

    print(f"lteration{t+1}: w0 = {w0:.6f}, w1={w1:.6f}")

print(f"최종 결과: w0 = {w0:.6f}, w1 = {w1:.6f}")