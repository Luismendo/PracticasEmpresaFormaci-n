// load the things we need
const { request } = require('express');
var express = require('express');
var app = express();

// set the view engine to ejs
app.set('view engine', 'ejs');

//get data from form
app.use(express.json());
app.use(express.urlencoded({extended: false}))

// use res.render to load up an ejs view file

var IDArray = [];
var OperationArray = [];
var TimeArrayUse = [];


// index page
app.get('/', function(req, res) {
    console.log(IDArray)

    console.log(req.query)
    console.log(req.query.id)
    res.render('pages/index',{id:req.query.id});
});

// about page
app.get('/about', function(req, res) {    
    res.render('pages/about');
});


app.post('/recuperardatos', function(req, res) {
    var resultTemp = 0;

    if(!IDArray.includes(req.body.id)){
        console.log("AA")
        IDArray.push(req.body.id);
    }
    console.log(req.body.id, IDArray)
    
    TimeArrayUse[IDArray.indexOf(req.body.id)] = Date.now();

    console.log(TimeArrayUse);

    if(IDArray.length > OperationArray.length){
        OperationArray.push(new Array);
        OperationArray[IDArray.indexOf(req.body.id)].push(req.body.accion)
        OperationArray[IDArray.indexOf(req.body.id)].push(req.body.number)
    }else if(IDArray.length = OperationArray.length){
        OperationArray[IDArray.indexOf(req.body.id)].push(req.body.accion)
        OperationArray[IDArray.indexOf(req.body.id)].push(req.body.number)      
    }

    for(var i = 0; i <= OperationArray[IDArray.indexOf(req.body.id)].length-1; i++) {
        console.log("Arr= " +OperationArray[IDArray.indexOf(req.body.id)][i]);

        switch(OperationArray[IDArray.indexOf(req.body.id)][i]){
            
            case "+":
                resultTemp = resultTemp + parseFloat(OperationArray[IDArray.indexOf(req.body.id)][i+1]);
                console.log("Result= " +resultTemp);
                i=i+1;
                break;
            case "-":
                resultTemp = resultTemp - parseFloat(OperationArray[IDArray.indexOf(req.body.id)][i+1]);
                i=i+1;
                break;
            case "*":
                resultTemp = resultTemp * parseFloat(OperationArray[IDArray.indexOf(req.body.id)][i+1]);
                i=i+1;
                break;    
            case "/":
                resultTemp = resultTemp / parseFloat(OperationArray[IDArray.indexOf(req.body.id)][i+1]);
                i=i+1;
                break;
        }
    }
    console.log("Result= " +resultTemp);

    console.log(OperationArray)

    console.log(req.body)
    res.render('pages/response',{operador:req.body.accion,numero:req.body.number,id:req.body.id,operaciones:OperationArray[IDArray.indexOf(req.body.id)],total:resultTemp});
});

setInterval(function() {
    var date = new Date();
    if ( date.getSeconds() === 0 ) {
      DoSomething();
    }

    for(var i = 0; i <= TimeArrayUse.length-1; i++) {
        if(Date.now() - TimeArrayUse[i] > 500){
            OperationArray.splice(i, 1);
            TimeArrayUse.splice(i, 1);    
        }
    }
  }, 500);

app.listen(8080);
console.log('8080 is the magic port');
