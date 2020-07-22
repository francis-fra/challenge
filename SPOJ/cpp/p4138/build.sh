cmake -H. -Bbuild
# build
cmake --build build

# run test
./build/runTests
# run main
./build/run
# read from stdio
cat p4138.txt | ./build/run

# ./build/runTests

# build and run tasks
cmake --build build; ./build/run
cmake --build build; ./build/runTests
# cmake --build build; ./build/runBSTTests

# g++ main.cpp Number.cpp