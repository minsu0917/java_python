import matplotlib.pyplot as plt

plt.plot([i for i in range (10)], [i*3 for i in range(10)])
plt.savefig('a.png')
plt.show()