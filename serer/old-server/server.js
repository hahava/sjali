const fs = require('fs');
const http = require('http');
const mysql = require('mysql');
const express = require('express');
const bodyParser = require('body-parser');

const client = mysql.createConnection({
  user: 'root',
  password: '1234',
  database: 'Company',
});

const app = express();
app.use(bodyParser.urlencoded());
app.use('/static', express.static(`${__dirname}/public`));
app.use(bodyParser.json());

http.createServer(app).listen(52273, () => {
  console.log('server running at http://127.0.0.1:52273');
});

app.get('/products/all', (req, res) => {
  client.query('SELECT * FROM products', (error, results) => {
    res.send(results);
  });
});

app.delete('/product/:id', (req, res) => {
  const { id: productId } = req.params;

  client.query('DELETE FROM products WHERE id=?', [productId], (error, results) => {
    res.send(results);
  });
});

app.post('/product', (req, res) => {
  const { body } = req;

  client.query('INSERT INTO products (title, subject, personnel, contents, name, major, phone) VALUES (?, ?, ?, ?, ?, ?, ?)', [
    body.title, body.subject, body.personnel, body.contents, body.name, body.major, body.phone,
  ], (error, results) => {
    res.send(results);
  });
});

app.update('/product/:id', (req, res) => {
  const { body } = req;

  client.query('UPDATE products SET name=?, modelnumber=?, series=? WHERE id=?', [
    body.name, body.title, body.series, req.param('id'),
  ], (error, results) => {
    res.send(results);
  });
});

app.get('/image/:productId', (req, res) => {
  fs.readFile('image.html', 'utf8', (error, data) => {
    res.send(data);
  });
});
