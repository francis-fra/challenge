cmake_minimum_required(VERSION 2.6)
 
# Locate GTest
find_package(GTest REQUIRED)
include_directories(${GTEST_INCLUDE_DIRS})
 
# Link runTests with what we want to test and the GTest and pthread library
# add_executable(runTests Number.test.cpp Number.cpp)
# target_link_libraries(runTests ${GTEST_LIBRARIES} pthread)

# add_executable(runLinkedNodeTests Linked.test.cpp Number.cpp)
# target_link_libraries(runLinkedNodeTests ${GTEST_LIBRARIES} pthread)

add_executable(runTests test.cpp solution.cpp)
target_link_libraries(runTests ${GTEST_LIBRARIES} pthread)

add_executable(run main.cpp solution.cpp)