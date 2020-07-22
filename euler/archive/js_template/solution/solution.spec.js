// import { add } from './solution'
const add = require('./solution')

describe('add()', () => {
    test('2 plus 4', () => {
      expect(add(2, 4)).toEqual(6)
    })
  
    // put xtest with test to run it
    xtest('1.2 + 3.8', () => {
      expect(add(1.2, 3.8)).toEqual(5.0)
    })
  
  })