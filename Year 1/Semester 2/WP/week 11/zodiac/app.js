"use strict";
const express = require("express");
const app = express();
const chineseYear=require("chinese-year");
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
app.get("/getyear", (req,res,next)=>{
    //res.send(`<h1>hey! ${req.query.year}</h1>`);//es6 templating
    const year = req.query.year ? req.query.year: new Date().getFullYear();
    const animal = chineseYear.getAnimal(year);
    res.render("results", {year:year, animal:animal});
})

app.use(express.urlencoded({extended:false}));
app.post("/getyear", (req,res,next)=>{
    //res.send(`<h1>hey! ${req.query.year}</h1>`);//es6 templating
    const year = req.query.year ? req.query.year: new Date().getFullYear();
    const animal = chineseYear.getAnimal(year);
    res.render("results", {year:year, animal:animal});
})

  //middleware that will serve html css pics etc anything static
app.use(express.static("public"));


app.listen(app.get("port"), ()=>{
    console.log("app running");
})

