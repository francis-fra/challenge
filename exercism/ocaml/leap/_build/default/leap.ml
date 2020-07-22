open Base;;
let leap_year yr = 
    let divisible_by_400 x = x % 400 = 0 in 
    let divisible_by_100 x = x % 100 = 0 in 
    let divisible_by_4 x = x % 4 = 0 in 
    (divisible_by_400 yr) || (divisible_by_4 yr && (not (divisible_by_100 yr)))
;;

