const express = require('express');
const app = express();
const port = 8887;


app.use(express.json());
const cors = require('cors');
app.use(cors());

app.get('/retrieve', (req, res, next) => {
const input = req.query; // parameters contained in the url (GET)
var data = '';
for (const key in input) {
data += ' - ' + input[key];
}
res.send({msg: 'Return from retrieve' + data});
})
app.listen(port, () => console.log(`Server running at localhost: ${port}!`))


app.post('/insert', (req, res, next) => {
    var data = '';
    const input = req.body.inData; // parameters contained in the body (POST)
    for (const key in input) {
        data += ' - ' + input[key];
    }
res.send({msg: 'Return from insert' + data});
})
app.listen(8887, () => console.log(`Server running at localhost: ${port}!`))