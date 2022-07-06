from flask import Flask,render_template,request

app = Flask("main",template_folder='python_work/220706/templates')

@app.route('/')
def index():
    num1=0
    num2=0

    if request.args.get("num1") is None :
        num1 = 0
    else:
        num1 = int(request.args.get("num1"))

    if request.args.get("num2") is None :
        num2 = 0
    else:
        num2 = int(request.args.get("num2"))

    if num1>num2:
        num1,num2=num2,num1
    result=0

    for i in range(num1,num2):
        result +=i

    return render_template('index.html',result=result)

app.run(debug=True)