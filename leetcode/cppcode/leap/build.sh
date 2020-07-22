mkdir build
cd build
cmake ..
make

# alternative
cmake -H. -Bbuild
cmake --build build
.build/leap