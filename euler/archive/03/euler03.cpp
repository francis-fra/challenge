#include <algorithm>
#include <cmath>
#include <iostream>
#include <stdexcept>
#include <string>
#include <vector>

using namespace std;

bool isPrime(long);
long maxPrime(long, long);
long maxPrime(long);

bool isPrime(long num) {
  long int upper_limit = (long) sqrt(num);
  for (long k=2; k<=upper_limit; k++) {
    if (num % k == 0) {
      return false;
    }
  }
  return true;
}

// recursion
long maxPrime(long num, long max_prime) {
    long int upper_limit = (long) sqrt(num);
    for (long k=2; k<=upper_limit; k++) {
      if ((num % k == 0) && (isPrime(k))) {
        return (maxPrime(num/k, max(max_prime, k)));
      }
    }
    return max(num, max_prime); // num is a prime
}

// dumb routine
long maxPrime(long num) {
  for (long k=num; k>0; k--) {
    if ((num % k == 0) && (isPrime(k)))
      return k;
  }
}

int main() {

  long int num;
  cout << "Enter a number: ";
  cin >> num;

  // Do prime factorization
  long int answer1 = maxPrime(num, 1);
  //long int answer2 = maxPrime(num);
  cout << "The largest prime factor = " << answer1 << endl;
  //cout << "The largest prime factor = " << answer2 << endl;


/*
  bool num_is_prime = isPrime(num);
  if (num_is_prime)
    cout << num << " is prime"  << endl;
  else
    cout << num << " is not prime"  << endl;
*/

  return 0;
}
