#include <bits/stdc++.h>

using namespace std;

class Solution {

public:
    static int solve(int a, int b) {
        return a + b;
    }

    static void write(int answer) {
        printf("%d\n", answer);
    }

};


int main() {

    int N;
    int first_num, second_num;

    // number of questions
    scanf("%d", &N);

    for (int k=0; k<N; k++) {
        scanf("%d %d", &first_num, &second_num);
        int answer = Solution::solve(first_num, second_num);
        Solution::write(answer);
    }

    return 0;
}