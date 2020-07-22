# function removeChar() {
#   arg=$1
#   len=${#arg}
#   echo len
#   var="${arg:1:len-2}"
#   echo $var
# }

function removeChar() {
  str=$1
  echo ${str:1:-1}
}
removeChar $1