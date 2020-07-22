#include "solution.hpp"
#include <string>


std::string solve(int c, int k, int w) {
    if (c*w > k) {
        return "no";
    } else {
        return "yes";
    }
}
