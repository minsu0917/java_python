from openpyxl.drawing.image import Image
from openpyxl import Workbook

wb = Workbook()
ws = wb.active

img = Image('main2.png')

ws.add_image(img,'A1')

wb.save('d.xlsx')
wb.close()