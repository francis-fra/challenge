// gcc -std=c99 -Wall problem7.c utility.c -lm

#include <stdio.h>
#include <stdlib.h>
#include "utility.h"
//#include <math.h>
//#include <stdbool.h>


int main(int argc, char** argv) {

        int target=atoi(argv[1]);
        int count=0; // number of prime found so far
        unsigned long number=1;
        
        while (count < target) {

                if (is_prime(++number))
                        count++;

        }

        printf("Count: %d\n", count);
        printf("%dth Prime: %ld\n", target, number);

        return 0;

}
