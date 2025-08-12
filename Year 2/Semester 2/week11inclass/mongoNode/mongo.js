import express from 'express';
import mongoose from 'mongoose';
import cors from 'cors';
const app = express();
const port = 8887;
app.use(express.json());
app.use(cors());
app.listen(port, () => console.log(`Server running at
localhost: ${port}!`))

const DataBase = 'mongodb://localhost:27017/sheridan';
mongoose.set('strictQuery', true);
const courseSchema = new mongoose.Schema({
    cid: String,
    wday: String,
    prof: String
});
const course = mongoose.model('courses', courseSchema);
mongoose.connect(DataBase);
const db = mongoose.connection;
db.on('error', (err) => { console.log(err); })
db.once('open', () => {
    app.post('/insert', (req, res) => {
        let input = req.body.data;
        course.create(input)
            .then(
                result => {
                    res.send({ "message": 'Record added' });
                })
            .catch(err => {
                console.log(err);
            });
    });
    app.get('/retrieve', (req, res) => {
        let input = req.query;
        course.find(input)
            .then(
                result => {
                    res.send(result);
                })
            .catch(err => {
                console.log(err);
            });
    });

    app.put('/update', (req, res) => {
        let input = req.body.data;
        course.updateOne({ cid: input.cid }, input)
            .then(
                result => {
                    res.send({ "message": 'Record updated' });
                })
            .catch(err => {
                console.log(err);
            });
    });


    app.delete('/delete', (req, res) => {
        let input = req.query;
        course.deleteOne(input)
            .then(
                result => {
                    res.send({ "message": 'Record deleted' });
                })
            .catch(err => {
                console.log(err);
            });
    });
});