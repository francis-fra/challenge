const twoSum = require('../src/problem01');

// matchers
/*
test('adds 1 + 2 to equal 3', () => {
    expect(sum(1, 2)).toBe(3);
});
*/

test('Example', () => {
    expect(twoSum([2, 7, 1, 15], 9)).toEqual([0, 1]);
});

test('My example', () => {
    expect(twoSum([2, 7, 1, 15], 22)).toEqual([1, 3]);
});