"use strict";
const express = require("express");
const app = express();
const scrabble = require("scrabble");
const checkword = require('check-dictionary-word')


app.set("view engine","ejs");

app.set("port",3000);


app.use((req,res,next)=>{
    console.log("using");
    next();
})

app.get("/test",(req,res)=>{
    // res.send("<h1>hey!" + req.query.id + "</h1>");
    res.send(`<h1>hey! ${req.query.id}</h1>`);//es6 templating
  })
  app.get("/getletters", (req, res) => {
    const letters = req.query.letter;
    let results = scrabble(letters);
    let validWords = [];
    
    // Check if results is an array
    if (Array.isArray(results)) {
        results.forEach(word => {
            if (checkword(word)) {
                validWords.push(word + " ");
            }
        });
        res.render("results", { results: validWords });
    } else {
        // Handle the case where results is not an array (e.g., when scrabble fails)
        res.render("invalidInput");
    }
});
    



app.use(express.urlencoded({extended:false}));


  //middleware that will serve html css pics etc anything static
app.use(express.static("public"));


app.listen(app.get("port"), ()=>{
    console.log("app running");
})

