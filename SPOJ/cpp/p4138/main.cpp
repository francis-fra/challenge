#include <cstdio>

char* solve(int c, int k, int w) {
    if (c*w > k) {
        return (char*)"no";
    } else {
        return (char*)"yes";
    }
}

int main() {

    int numLines, c, k, w; 

    scanf("%d", &numLines);
	while(numLines--) {
		scanf("%d %d %d", &c, &k, &w);
        printf("%s\n", solve(c,k,w));
    }

    return 0;

}