package solution

// import (
// 	"fmt"
// )

func Solution(n int) int {
	total := 0
	for k:=3; k<n; k++ {
		if (k%3==0 || k%5==0) {
			// fmt.Println(k)
			total += k
		}
	}
	return total
}
