// TOOD: OO structural 

let fs=require('fs');

// read inputs
let lines = fs.readFileSync('/dev/stdin').toString().split("\n")
// number of questions
let N = parseInt(lines[0])
lines.shift()

for (var k=0; k<N; k++) {
    let inputs = lines[k].split(/\s+/)
    let first_num = parseInt(inputs[0])
    let second_num = parseInt(inputs[1])
    console.log(first_num + second_num)
}