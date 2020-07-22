CPP = g++
.SUFFIXES : .o .cpp .c
OFLAG = -o
.cpp.o :
	$(CPP) $(CPPFLAGS) -c $<
.c.o :
	$(CPP) $(CPPFLAGS) -c $<

solve: solution.cpp
	$(CPP) $(OFLAG) solve solution.cpp