const { frutas, dinero, func1 } = require("./importing");
const todo = require("./functions");

todo.pepe()

func1()

frutas.forEach((fruta) => {
  console.count(fruta);
});

console.log("mi dinero actual: ", dinero);
console.log("exports 2: ", todo.variable);

const http = require("http");

const hostname = '127.0.0.1';
const port = process.env.PORT || 3000;
console.log("process.env.PORT es: " +process.env.PORT)


const server = http.createServer((req, res) => {
  res.statusCode = 200;
  res.setHeader("Content-Type", "text/html");
  res.end("<h1>Hello, World!</h1>");
});

server.listen(port, () => {
  console.log(`Server running at http://${hostname}:${port}`);
});