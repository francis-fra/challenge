// es6
// export const add = (a, b) => {
//     return a+b;
// }

export const sumMultiples = (n) => {
    let total = 0
    for (var k=2; k<n; k++) {
        if (k%3==0 || k%5==0) {
            total += k
        }
    }
    return total
}
