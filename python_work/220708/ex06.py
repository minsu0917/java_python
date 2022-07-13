from openpyxl import Workbook
import random as np

wb = Workbook()
ws = wb.active

index = 1
for r in range(1, 11):
    for c in range(1, 11):
        ws.cell(row=r, column=c).value = np.random()*100


wb.save('b.xlsx')
wb.close()
