package solution_test

import (
	"testing"
	"github.com/stretchr/testify/assert"
	// sol "solution"
	sol "."
)

func TestSolution(t *testing.T) {

	assert.Equal(t, sol.Solution(5, 15, 3), "yes")
	assert.Equal(t, sol.Solution(1, 5, 4), "yes")
	assert.Equal(t, sol.Solution(13, 25, 2), "no")
}