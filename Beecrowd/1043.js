var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');



// lines = "6.0 4.0 2.0"
var lados = lines.split(" ")
lados = lados.map(Number)

function isTriangle(lados) {
    if (lados[0] < lados[1] + lados[2] && lados[1] < lados[0] + lados[2] && lados[2] < lados[0] + lados[1]) {
        return true
    }
}

if (isTriangle(lados)) {
    console.log("Perimetro =", (lados.reduce((partialSum, a) => partialSum + a, 0)).toFixed(1))
}
else{
    console.log("Area =", ((lados[0]+lados[1])*lados[2]/2).toFixed(1))
}