s=[1,7,2,4]
k=3;
def nonDivisibleSubset(k, s):
    count = [0] * k
    
    # Count occurrences of each remainder when divided by k
    for num in s:
        count[num % k] += 1
        print(num%k)
    print(count)
    
    # Start with 0 or 1 from remainder 0
    result = min(count[0], 1)
    
    # For each pair of remainders, choose the maximum count
    for i in range(1, (k // 2) + 1):
        if i != k - i:
            result += max(count[i], count[k - i])
    
    # If k is even, we can only take one of the numbers that gives remainder k/2
    if k % 2 == 0:
        result += 1
    
    return result

    

print(nonDivisibleSubset(k,s))