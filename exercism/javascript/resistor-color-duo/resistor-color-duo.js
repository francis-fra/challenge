let colors = {
  "black": 0,
  "brown": 1,
  "red": 2,
  "orange": 3,
  "yellow": 4,
  "green": 5,
  "blue": 6,
  "violet": 7,
  "grey": 8,
  "white": 9
}


export const value = (lst) => {
  let len = lst.length
  return lst.map((x, idx) => {return colors[x] * Math.pow(10, len-idx-1)}).reduce((x,y) => {return x + y;})
};
