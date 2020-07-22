#include "gtest/gtest.h"

namespace {

    TEST(sample, test) {
        EXPECT_EQ(1+1, 2);
    }

}

int main(int argc, char **argv) {
    // initialize the framework
    testing::InitGoogleTest(&argc, argv);
    // macro
    return RUN_ALL_TESTS();
}