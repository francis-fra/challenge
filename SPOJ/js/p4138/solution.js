function solve(c, k, w) {
    if (c*w > k) {
        return "no"
    } else {
        return "yes"
    }
}

module.exports = solve;