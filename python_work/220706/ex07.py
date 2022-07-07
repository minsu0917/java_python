from flask import Flask,render_template,request
from calcresult import returnresult

app = Flask("main",template_folder='python_work/220706/templates')

@app.route('/')
def index():
    result = returnresult(request.args.get("num1"),request.args.get("num2"))

    return render_template('index.html',result=result)

app.run(debug=True)