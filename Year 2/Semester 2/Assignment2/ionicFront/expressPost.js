const express = require('express');
const app = express();
const port = 8887;
app.use(express.urlencoded({extended:true}));
app.use((req, res, next) => {
res.write('<!doctype html><html lang="en"><head><meta charset="utf-8">' +
'<title>POST Request</title></head><h3>POSTRequest</h3><div><ul>');
next(); })
app.post('/insert', (req, res, next) => {
const input = req.body; // parameters contained in the body (POST)
res.write(`<h2>Hello Class - ${req.method}</h2>`);
for (const key in input) {
res.write(`<li>${key} - ${input[key]}</li>`);
}
res.write(`</ul></div></body></html>`);
res.end(); })
app.listen(8887, () => console.log(`Server running at localhost: ${port}!`))