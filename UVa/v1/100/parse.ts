// let re = new RegExp('[0-9]+\s*[0-9]+', 'g');
// let re = /(\d+)\s+(\d+)/
// let str = "4 7"
// var sel = str.match(re)
// console.log(sel)
// [ '4  7', '4', '7', index: 0, input: '4  7' ] 


const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
  terminal: false
});

rl.on('line', function(line){
    let inputs = line.split(/\s+/)
    console.log(inputs)
})

// let fs=require('fs');
// let lines = fs.readFileSync('/dev/stdin').toString().split("\n")
// console.log(lines)