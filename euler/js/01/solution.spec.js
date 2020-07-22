// import { add } from './solution'
const sumMultiples = require('./solution')

describe('sumMultiples', () => {
    test('n=10', () => {
      expect(sumMultiples(10)).toEqual(23)
    })
  
    // replace xtest with test to run it
    xtest('n=13', () => {
      expect(sumMultiples(13)).toEqual(45)
    })
  
  })