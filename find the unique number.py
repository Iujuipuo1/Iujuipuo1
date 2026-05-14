a = [3,1,5,7,2,1,3,9,11,11,12,13,12]
unique = []

for i in range(len(a)):
    j = 0
    found = False
    while j < len(unique):
        if a[i] == unique[j]:
            found = True
            break
        j += 1
    if not found:
        unique.append(a[i])

print(unique)
    

