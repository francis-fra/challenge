// gcc -std=c99 -Wall problem3.c -lm

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
//#include <stdbool.h>

// TODO: check prime function
_Bool is_prime(unsigned long long num) {

        _Bool prime = 1;
        for (long long k=2; k<=sqrt(num); k++) {
                if (num%k==0) {
                        prime = 0;
                        break;
                }
        }

        return prime;
}



int main(int argc, char** argv) {

        // find the factors
        unsigned long long number = atoll(argv[1]);
        unsigned long long answer = 1L;
        unsigned long long init = floor(sqrt(number));

        
        printf("Number = %lld\n", number);
        printf("Init = %lld\n", init);        
        printf("prime = %d\n", is_prime(number));

        for(unsigned long long k=init; k>1; k--) {
                if ((number % k == 0) & is_prime(k)) {
                        answer = k;
                        break;
                }
        }

        printf("Answer = %lld\n", answer);
        
        return 0;
}
