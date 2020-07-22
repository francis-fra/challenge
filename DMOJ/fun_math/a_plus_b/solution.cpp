#include <bits/stdc++.h>

using namespace std;

int main() {

    int N;
    int first_num, second_num;
    // number of questions
    scanf("%d", &N);

    for (int k=0; k<N; k++) {
        scanf("%d %d", &first_num, &second_num);
        printf("%d\n", first_num + second_num);
    }

    return 0;
}