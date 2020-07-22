/* 
Sample Input
    1  10
    100  200
    201  210
    900  1000

Sample Output
    1  10  20
    100  200  125
    201  210  89
    900  1000  174
*/
#include <cstdio>

int first_num, second_num;

int main() {
    // read intput
    while (scanf("%d %d", &first_num, &second_num) == 2) {
        printf("%d %d\n", first_num, second_num);
    }

}