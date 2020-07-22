(define-module (hamming)
  #:export (hamming-distance))

(define (hamming-distance str1 str2)
  (define (hamming-itr lst1 lst2 result)
    (cond ((or (null? lst1) (null? lst2)) result)
          ((eq? (car lst1) (car lst2)) (hamming-itr (cdr lst1) (cdr lst2) result))
          (else (hamming-itr (cdr lst1) (cdr lst2) (+ 1 result)))
          ))
  ; raise an error if different length
  (if (not (= (string-length str1) (string-length str2)))
    (throw 'unequal)
    (hamming-itr (string->list str1) (string->list str2) 0))
)

