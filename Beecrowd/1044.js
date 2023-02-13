var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var entrada = lines.shift().split(" ")

// var lines = "6 30"
// var entrada = lines.split(" ")

entrada = entrada.map(Number)

if (entrada[1] % entrada[0] === 0 || entrada[0] % entrada[1] === 0) console.log("Sao Multiplos")
else console.log("Nao sao Multiplos")