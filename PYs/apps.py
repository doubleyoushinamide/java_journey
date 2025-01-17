import random as rand
import time

number_array = [rand.randint(1, 1_000_000) for _ in range(1_000_000)]
start = time.time()
sorted_array = sorted(number_array)
end = time.time()
print(f"Sorting Complete! \n after {end - start :.3f} seconds")