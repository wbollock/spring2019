// Here, we load necessary packages

//Web framework for backend web development
const express = require('express'); 
const app = express();

// This packages lets us use json format to send/receive messages
const bodyParser = require('body-parser');
app.use(bodyParser.urlencoded({extended: true})); // support encoded bodies
app.use(bodyParser.json()); // support json encoded bodies

//This package lets us use some methods to handle filesystem paths
const path = require('path');

//This line configures express in order to use all the files in the public
//folder as the files that compose the web page
app.use(express.static('public'));


//GET request handler for the resource 'root' '/'
// No data from the user is used to handle the request
app.get('/', 
    function (req, res) {
        res.sendFile(
            __dirname + '/' + 'index.html'
        );
    }
);


//GET request handler for the resource server
// No data from the user is used to handle the request
app.get('./server', 
    function (req, res) {
        const filePath = './public/index2.html';
        const resolvedPath = path.resolve(filePath);
        res.sendFile(resolvedPath);
    }
);

//GET request handler for the resource process
// This handler uses data entered by the user
app.get('/process', 
    function (req, res) {
        // Prepare output in JSON format
        const response = {
            first_name: req.query.firstname_get,
            last_name: req.query.lastname_get,
            message: 'Hello there!!'
        };
    console.log(response);
    res.json(JSON.stringify(response));
});

// POST request handler for the resource process
// This handler uses data entered by the user
app.post('/process', 
    function (req, res) {
        // Prepare output in JSON format
        const response = {
            first_name: req.body.firstname_post,
            last_name: req.body.lastname_post,
            message: 'Hello there!!'
        };
        console.log(response);
        res.json(JSON.stringify(response));
    }
);


// Source code to start the server
const port = 8081;
const server = app.listen(port, function () {
    const host = server.address().address;
    const port = server.address().port;

    console.log("Example app listening" +
        " at http://%s:%s", host, port);
});

