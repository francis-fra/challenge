// Given nums = [2, 7, 11, 15], target = 9,

// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].

//  * @param {number[]} nums
//  * @param {number} target
//  * @return {number[]}
namespace problem01 {

    const nums = [12, 7, 11, 15]
    const target = 18

    let twoSum = function(nums: number[], target: number){

        // sort the nums first
        let num_tuple = nums.map( (val, idx) => ({idx: idx, val: val}))
        let num_array = nums.map( (val, idx) => ( [idx, val]))
        // FIXME: arrow function
        // num_tuple.sort((a, b) => (if (a.val > b.val) return -1)

        // ascending order
        // num_tuple = num_tuple.sort(function(a, b) {
        //     if (a.val > b.val) return 1;
        //     return -1
        // })
        // console.log(num_tuple) 

        num_array = num_array.sort(function(a, b) {
            if (a[1] > b[1]) return 1;
            return -1
        })
        console.log(num_array) 
 
        // TODO: find pair

        // for (let a of num_tuple) {
        //     let firstnum = a.val
        //     let secondnum = target - firstnum
        //     for (let b of )

        // }

    }

    twoSum(nums, target)
}
