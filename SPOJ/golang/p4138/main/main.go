package main

import (
	"fmt"
)

func solve(c, k, w int) string {
	if (c*w > k) {
		return "no"
	} else {
		return "yes"
	}
}

func main() {

	var numLines int
	var c, k, w int
	fmt.Scanln(&numLines)

	for ; numLines > 0; numLines -- {
		fmt.Scanln(&c, &k, &w)
		fmt.Println(solve(c, k, w))
	}

}