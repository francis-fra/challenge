package main

import (
	// "bufio"
	"fmt"
	// "os"
	// "log"
	// "io"
	sol "../solution"
	// "strings"
)

func main() {

	var numLines int
	// var a, b, c int
	var c, k, w int
	// ------------------------------------------------------------
	// contest requirement: read from stdin
	// ------------------------------------------------------------
	// fmt.Scanf("%d", &numLines)
	fmt.Scanln(&numLines)

	// fmt.Println(numLines)
	for ; numLines > 0; numLines -- {
		fmt.Scanln(&c, &k, &w)
		// fmt.Scanf("%d %d %d", &a, &b, &c)
		// fmt.Printf("a: %d, b: %d, c: %d\n", a, b, c)
		// output
		fmt.Println(sol.Solution(c, k, w))
	}

	// ------------------------------------------------------------
	// read from file
	// ------------------------------------------------------------
	// file, err := os.Open("../../data/p4138.txt")
    // if err != nil {
    //     log.Fatal(err)
	// }
	// var f io.Reader = (*os.File)(file)
	// fmt.Fscanln(f, &numLines)
	// fmt.Println(numLines)
	// for ; numLines > 0; numLines -- {
	// 	fmt.Fscanln(f, &c, &k, &w)
	// 	fmt.Printf("c: %d, k: %d, w: %d\n", c, k, w)
	// }
	





	// file, err := os.Open("./data/p4138.txt")
    // if err != nil {
    //     log.Fatal(err)
    // }
	// defer file.Close()

	// scanner := bufio.NewScanner(file)
	// scanner.Scan()
	// line := scanner.Text()
	// fmt.Println(line)

	// // now read the rest
	// var a, b, c int
	// for scanner.Scan() {
	// 	_, err := fmt.Fscanln(, &a, &b, &c)
	// }
	// 	result := strings.Split(line, ",")



	// for input.Scan() {
	// 	fmt.Println(input.Text())
	// }
	// TODO: read tokens

	// counts := make(map[string]int) // counts of Unicode characters
	// // var utflen [utf8.UTFMax + 1]int // count of lengths of UTF-8 encodings
	// // invalid := 0                    // count of invalid UTF-8 characters

	// input := bufio.NewScanner(os.Stdin)
	// input.Split(bufio.ScanWords)
	// for input.Scan() {
	// 	word := input.Text()
	// 	counts[word]++
	// 	fmt.Println(word)
	// }
	// fmt.Println(counts)
}