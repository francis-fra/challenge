#include "01.h"

namespace p01 {

    int sumMultiples(int n) {

        int total = 0;
        for (int k=2; k<n; k++) {
            if (k%3==0 || k%5==0) {
                total += k;
            }
        }
        return total;

    }

}