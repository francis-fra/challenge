var spiral = 1001
add = (x, y) => x + y

// double gap once a spiral is formed
function enlist(spiral) {
  var gap = 2
  var result = []
  var spiralsq = spiral * spiral
  var next_spiral = 3
  var next_sprial_sq = next_spiral * next_spiral
  for (let k=1; k <= spiralsq; k=k+gap) {
    if (k == next_sprial_sq) {
      next_spiral = next_spiral + 2
      next_sprial_sq = next_spiral * next_spiral
      gap = gap + 2
    }
    result.push(k)
  }
  // return (result)
  return (result.reduce(add, 0))
}

answer = enlist(spiral)
