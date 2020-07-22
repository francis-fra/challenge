#include <math.h>


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

