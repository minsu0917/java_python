from point import Point

class Circle:
    def __init__(self,x,y,r):
        print("here",x,y,r)
        self.p = Point(x,y)
        self.r = r

    def showInfo(self):
        self.p.showInfo()
        print(f'반지름 = {self.r}')
        #pass                #아무 내용없으면 pass 적어야 댐
    
c= Circle(2,2,4)
c.showInfo()