(in-package #:cl-user)
(defpackage #:two-fer
  (:use #:cl)
  (:export #:twofer))
(in-package #:two-fer)

;; (defun twofer (name)
;;   (setf name 
;;     (if (null name)
;;       "you" name))

;;   (concatenate 'string
;;     (concatenate 'string "One for " name)
;;     ", one for me.")) 


(defun twofer (name)
  (let ((person (if (null name) "you" name)))
    (concatenate 'string "One for " person ", one for me.")) )