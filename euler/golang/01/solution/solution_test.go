package solution_test

import (
	"testing"
	"github.com/stretchr/testify/assert"
	// sol "../p4138"
	// sol "solution"
	sol "."
)

func TestSolution(t *testing.T) {

	assert.Equal(t, sol.Solution(10), 23)
	// assert.Equal(t, Solution(1, 2), 3)
}