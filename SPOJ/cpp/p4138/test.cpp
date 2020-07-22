#include "gtest/gtest.h"
#include "solution.hpp"

// argument of TEST: test suite and test name
namespace {

    TEST(sample, test) {
        EXPECT_EQ(solve(5, 15, 3), "yes");
        EXPECT_EQ(solve(13, 25, 2), "no");
    }

}

int main(int argc, char **argv) {
    // initialize the framework
    testing::InitGoogleTest(&argc, argv);
    // macro
    return RUN_ALL_TESTS();
}