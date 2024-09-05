const fs = require("fs"); // for reading and writing files (comes with node)
const express = require("express"); // requiring express
const app = express(); // making an app from express

app.set("port", process.env.PORT || 3000);  // just makes sure theres the right port being used

// set where static files such as html, images, css pages are located
app.use(express.static('public')); // makes sure the url goes to the right place E.G. localhost/flatfile.html  instead of localhost/public/flatfile.html or something

// FLAT FILE

app.get("/flatfile", (req, res)=>{ // calling flat file
    // get data can be collected with req.query
    // this is an object with properties that match the names of the form fields
    console.log(req.query);

    const name = req.query.name;
    const birthday = req.query.birthday;
    const data = name + "|" + birthday + "\n";

    let message = "Generated Ascii Art!";

    // We want to append to a file - but you can also do the following:
    // fs.readFile(file, encoding, callback)
    // fs.writeFile(file, content, callback)
    // fs.unlink(file, callback) // to delete

    fs.appendFile("flatfile.txt", data, err => {
        if (err) message = "Sorry, error generating Ascii Art";
    });

    // later we will see the Fetch API (similar to AJAX)
    // to save data without going to another page
    res.redirect("flatfileresults.html?message=" + message);

});

// JSON AND FETCH
        
// use a joke package - there are a bunch of them - do a search at https://npmjs.com
const figlet = require('figlet');

// this will route any JSON data to the req.body
app.use(express.json())

// route getjoke
app.post("/getjoke", (req, res)=>{

    let topic = req.body.topic;

    console.log("Words = " + topic);

    figlet(topic, function (err, data) {
        if (err) {
          console.log("Something went wrong...");
          console.dir(err);
          return;
        }
        console.log(data);
      });
   

    // create json to send back
    const data = JSON.stringify({warning:warning, joke:joke.body});
    
    // send the json back
    res.json(data);

});

//Run the app again:

// type this in the terminal and press enter
//node app

// or use nodemon:  npm i -D nodemon 
// then add "start":"nodemon app.js" in the script of package.json (and comma above)
// npm start

// SESSIONS

// controllers holds our app code to make the express code less
controller = require("./controllers/controller");

// import session
const session = require('express-session');

// use session
app.use(session({
    secret: "secretkey",
    saveUninitialized: false,
    resave: false 
}));

// set the template engine
app.set("view engine", "ejs");

// handle get requests to page1
app.get("/page1", controller.showPage1);

// handle get requests to page2
app.get("/page2", controller.showPage2);

// other requests have post data
app.use(express.urlencoded({ extended: false }));

// handle post requests to getuser
app.post("/getuser", controller.getUser);


app.listen(app.get("port"), ()=>{
    console.log("running on " + app.get("port"));
});