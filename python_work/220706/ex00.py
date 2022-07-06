from flask import Flask,render_template

app = Flask("main",template_folder='templates')

@app.route('/')
def index():
    return render_template('index.html')

app.run(debug=True,host='127.0.0.1',port=5000)