#include "gtest/gtest.h"
#include "solution.hpp"

// argument of TEST: test suite and test name
namespace {

    TEST(sample, test) {
        EXPECT_EQ(sumMultiples(10), 23);
    }

}

int main(int argc, char **argv) {
    // initialize the framework
    testing::InitGoogleTest(&argc, argv);
    // macro
    return RUN_ALL_TESTS();
}