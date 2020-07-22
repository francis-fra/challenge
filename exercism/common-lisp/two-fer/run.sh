
sbcl --load two-fer-test.lisp --quit

rlwrap sbcl

(defvar you)
(setf you "ALice")
(concatenate
    'string
    (concatenate 'string "one For " you)
    "one for me")

(setf you (if (null hi)
       "nil" "hi"))

(setf hi "good")
(null hi)