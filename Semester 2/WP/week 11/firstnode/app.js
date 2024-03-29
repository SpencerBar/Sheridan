const http = require("http");

//request = req (what came in) response = res (whats going out)
const app = http.createServer((req,res)=>{
    console.log("here");
    res.end("Hello Fam");
});

const hostname = "localhost";
const port = 3000;
app.listen(port, hostname, ()=>{
    console.log("app running on port: 3000")
});