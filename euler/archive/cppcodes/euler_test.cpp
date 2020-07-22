#include "gtest/gtest.h"
#include "solution.hpp"

// argument of TEST: test suite and test name
namespace {

    TEST(sample, test) {
        EXPECT_EQ(add(1, 3), 4);
    }

}

int main(int argc, char **argv) {
    // initialize the framework
    testing::InitGoogleTest(&argc, argv);
    // macro
    return RUN_ALL_TESTS();
}