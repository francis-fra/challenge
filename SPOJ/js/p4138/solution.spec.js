// import { add } from './solution'
const solve = require('./solution')

describe('sumMultiples', () => {
    test('one', () => {
      expect(solve(5, 15, 3)).toEqual("yes")
    })

    test('two', () => {
      expect(solve(13, 25, 2)).toEqual("no")
    })
  
    // replace xtest with test to run it
    xtest('n=13', () => {
      expect(solve(1, 5, 4)).toEqual("yes")
    })
  
  })