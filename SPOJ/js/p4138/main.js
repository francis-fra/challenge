// read from stdiin
process.stdin.resume();
process.stdin.setEncoding('utf8');
 
// solution
function solve(c, k, w) {
    if (c*w > k) {
        return "no"
    } else {
        return "yes"
    }
}

var arr = ""	
process.stdin.on('data', function (chunk) {
	// read all
	arr += chunk;
});

process.stdin.on('end', function() {
	arr = arr.split("\n")
	// in order ot get no of test cases
	var numLines = parseInt(arr.shift());
	// solve problems
	for(let k=0;k<numLines;k++) {
		param = (arr[k]).split(' ')
		console.log(solve(...param))
	}
})