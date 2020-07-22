/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    len = nums.length
    answer = []
    for(k=0; k<len-1; k++) {
        first = nums[k]
        for (j=k+1; j<len; j++) {
            second = nums[j]
            if (first + second == target)
                answer = [k, j]
        }
    }
    return answer
};
module.exports = twoSum;

// function sum(a, b) {
//     return a + b;
// }
// module.exports = sum;