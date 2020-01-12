// 모듈을 추출합니다.
var fs = require('fs');
var ejs = require('ejs');
var http = require('http');
var mysql = require('mysql');
var express = require('express');
var bodyParser = require('body-parser');

// 데이터베이스와 연결합니다.
var client = mysql.createConnection({
    user: 'root',
    password: '1234',
    database: 'Company'
});

// 서버를 생성합니다.
var app = express();
app.use(bodyParser.urlencoded());
app.use('/static', express.static(__dirname + '/public'));
app.use(bodyParser.json());

// 서버를 실행합니다.
http.createServer(app).listen(52273, function () {
    console.log('server running at http://127.0.0.1:52273');
});

// 라우트를 수행합니다.
app.get('/', function (request, response) {
    // 파일을 읽습니다.
    fs.readFile('list.html', 'utf8', function (error, data) {
        // 데이터베이스 쿼리를 실행합니다.
        client.query('SELECT * FROM products', function (error, results) {
            // 응답합니다.
            response.send(ejs.render(data, {
                data: results
            }));
        });
    });
});

app.post('/', function (request, response) {
    // 파일을 읽습니다.
    fs.readFile('list.html', 'utf8', function (error, data) {
        // 데이터베이스 쿼리를 실행합니다.
        client.query('SELECT * FROM products', function (error, results) {
            // 응답합니다.
            response.send(ejs.render(data, {
                data: results
            }));
        });
    });
});

app.get('/delete/:id', function (request, response) {
    // 데이터베이스 쿼리를 실행합니다.
    client.query('DELETE FROM products WHERE id=?', [request.param('id')], function () {
        // 응답합니다.
        response.redirect('/');
    });
});
app.get('/insert', function (request, response) {
    // 파일을 읽습니다.
    fs.readFile('insert.html', 'utf8', function (error, data) {
        // 응답합니다.
        response.send(data);
    });
});

app.get('/image', function (request, response) {
    // 파일을 읽습니다.
    fs.readFile('image.html', 'utf8', function (error, data) {
        // 응답합니다.
        response.send(data);
    });
});


app.post('/insert', function (request, response) {
    // 변수를 선언합니다.
    var body = request.body;

    // 데이터베이스 쿼리를 실행합니다.
    client.query('INSERT INTO products (title,subject,personnel,contents,namel,major,phone) VALUES (?, ?, ?, ?, ?, ?, ?)', [
        body.title, body.subject,body.personnel,body.contents,body.namel,body.major,body.phone
    ], function () {
        // 응답합니다.
        response.redirect('/');
    });
});
app.get('/edit/:id', function (request, response) {
    // 파일을 읽습니다.
    fs.readFile('edit.html', 'utf8', function (error, data) {
        // 데이터베이스 쿼리를 실행합니다.
        client.query('SELECT * FROM products WHERE id = ?', [
            request.param('id')
        ], function (error, result) {
            // 응답합니다.
            response.send(ejs.render(data, {
                data: result[0]
            }));
        });
    });
});
app.post('/edit/:id', function (request, response) {
    // 변수를 선언합니다.
    var body = request.body

    // 데이터베이스 쿼리를 실행합니다.
    client.query('UPDATE products SET name=?, modelnumber=?, series=? WHERE id=?', [
        body.name, body.modelnumber, body.series, request.param('id')
    ], function () {
        // 응답합니다.
        response.redirect('/');
    });
});