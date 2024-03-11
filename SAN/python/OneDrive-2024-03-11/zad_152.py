nums = [123, 345, 234, 765]
for i in range (0, len(nums)):
    print(nums[i])
x = int(input('Enter a three-digit number from list : '))
if x in nums:
    print(x ,' is at ', nums.index(x) ,' position in the list')
else:
    print('That is not in the list')
