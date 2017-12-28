####
#
# Binary Indexed Tree:
#
# update, getSum each takes O(log n)
# construction takes O(n log n)
#
####



def BIT(array):
    n = len(array)
    tree = [0]*(n+1)
    for i in range(n):
        update(tree, i, array[i])
    return tree

def update(BIT, index, value):
    index += 1
    while index <= len(BIT)-1:
        BIT[index] += value
        index += index & (-index)

def getSum(BIT, index):
    result = 0
    index += 1
    while index > 0:
        result += BIT[index]
        index -= index & (-index)
    return result