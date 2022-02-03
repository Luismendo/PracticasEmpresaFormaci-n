const frutas = ["banana", "banana", "pera", "banana"];
const dinero = 1000;

// Exportamos en un objeto

module.exports = {
  frutas: frutas,
  dinero,
  func1: pasado,
  
};

function pasado(){
  console.log("module.export de especific")
}