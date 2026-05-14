name: str 
grade: int
subject = [str]*2
mark = [int]*2

def receiveInfo():
    global name, grade
    name = input("Enter your name: ")
    grade = int(input("Enter your grade level: "))
    subject[0] = input("Enter your subject: ")
    subject[1] = input("Enter your subject: ")
    mark[0] = int(input("Enter your score: "))
    mark[1] = int(input("Enter your score: "))


def outputInfo():
    global name, grade
    print("Name= ", name)
    print("Grade= ", grade)
    print("Subject 1= ", subject[0])
    print("Subject 2= ", subject[1])
    print("Mark 1= ", mark[0])
    print("Mark 2= ", mark[1])


def calAveMark (mark1: int,mark2:int):
    mark= (mark1 + mark2)/2
    print("Average Mark =", mark)

receiveInfo()
outputInfo()
calAveMark(mark[0],mark[1])




