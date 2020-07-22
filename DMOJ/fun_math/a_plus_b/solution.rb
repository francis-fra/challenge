# TODO: OO structure

N = gets.chomp.to_i
N.times {
    inputs = gets.chomp.split(" ")
    answer = inputs[0].to_i + inputs[1].to_i
    p answer
}