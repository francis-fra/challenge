/* 
Sample Input
    1  10
    100  200
    201  210
    900  1000

Sample Output
    1  10  20
    100  200  125
    201  210  89
    900  1000  174
*/
let fs=require('fs');

// read inputs
let lines = fs.readFileSync('/dev/stdin').toString().split("\n")
for (let line of lines) {
    let inputs = line.split(/\s+/)
    console.log(inputs)
}
 
