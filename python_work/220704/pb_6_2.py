# p.1
str = "The Espresso Spirit"

str1 = str.upper()
print(str1)
str2 = str.lower()
print(str2)
print(str)

# p.2
def birth_only(num):
    num=num.split('-')
    return num[0]

p1='990917-1*******'
p1=birth_only(p1)
print(p1)

p2='011122-3*******'
p2=birth_only(p2)
print(p2)