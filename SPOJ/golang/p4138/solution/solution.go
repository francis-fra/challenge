package solution

func Solution(c, k, w int) string {
	if (c*w > k) {
		return "no"
	} else {
		return "yes"
	}
}
