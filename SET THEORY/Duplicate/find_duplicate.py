def find_duplicate(nums):
  dic = {}
  for i,num in enumerate(nums):
     if num in dic:
        return num,i
     dic[num]='0'
  return -1
